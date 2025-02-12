package br.com.VollMed.dto;


import br.com.VollMed.domain.address.Address;
import br.com.VollMed.domain.doctor.Doctor;
import br.com.VollMed.domain.doctor.Speciality;

public record ResponseDoctorDTO(String name,
                                String email,
                                String cpf,
                                String phone,
                                Speciality speciality,
                                Address address
) {
    public ResponseDoctorDTO(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCpf(), doctor.getPhone(), doctor.getSpeciality(), doctor.getAddress());
    }
}
