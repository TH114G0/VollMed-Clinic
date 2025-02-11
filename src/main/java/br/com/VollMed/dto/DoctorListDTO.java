package br.com.VollMed.dto;

import br.com.VollMed.domain.doctor.Doctor;
import br.com.VollMed.domain.doctor.Speciality;

public record DoctorListDTO(String name, String email, String phone, Speciality speciality) {
    public DoctorListDTO(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getPhone(), doctor.getSpeciality());
    }
}
