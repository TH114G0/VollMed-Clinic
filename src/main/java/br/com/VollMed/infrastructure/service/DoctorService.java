package br.com.VollMed.infrastructure.service;

import br.com.VollMed.domain.doctor.Doctor;
import br.com.VollMed.dto.DoctorCreateDTO;
import br.com.VollMed.dto.DoctorListDTO;
import br.com.VollMed.dto.DoctorUpdateDTO;
import br.com.VollMed.dto.ResponseDoctorDTO;
import br.com.VollMed.infrastructure.repository.DoctorRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @Transactional
    public ResponseDoctorDTO create(DoctorCreateDTO doctorCreateDTO) {
        var doctor = doctorRepository.save(new Doctor(doctorCreateDTO));
        return new ResponseDoctorDTO(doctor);
    }

    @Transactional
    public Page<DoctorListDTO> list(Pageable pageable) {
        return doctorRepository.findAllByActiveTrue(pageable).map(DoctorListDTO::new);
    }

    @Transactional
    public DoctorUpdateDTO update(DoctorUpdateDTO doctorUpdateDTO) {
        var doctor = doctorRepository.findById(doctorUpdateDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("ID informado " + doctorUpdateDTO.getId() + ", não foi encontrado!"));
        doctor.update(doctorUpdateDTO);
        return doctorUpdateDTO;
    }

    @Transactional
    public void delete(Long id) {
        var doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("ID informado " + id + ", não foi encontrado!"));
        doctor.delete();
    }

    public ResponseDoctorDTO details(Long id) {
        var doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("ID informado " + id + ", não foi encontrado!"));
        return new ResponseDoctorDTO(doctor);
    }
}
