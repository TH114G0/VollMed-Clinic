package br.com.VollMed.infrastructure.service;


import br.com.VollMed.domain.address.Address;
import br.com.VollMed.domain.doctor.Doctor;
import br.com.VollMed.domain.doctor.Speciality;

public record ResponseDoctor(String name,
                             String email,
                             String cpf,
                             String phone,
                             Speciality speciality,
                             Address address
) {
    public ResponseDoctor(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCpf(), doctor.getPhone(), doctor.getSpeciality(), doctor.getAddress());
    }
}
