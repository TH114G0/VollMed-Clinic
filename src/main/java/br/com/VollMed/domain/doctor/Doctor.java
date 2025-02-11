package br.com.VollMed.domain.doctor;

import br.com.VollMed.domain.address.Address;
import br.com.VollMed.dto.DoctorCreateDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "doctors")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String cpf;

    private String phone;

    private LocalDateTime created_at;

    private boolean active;

    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @Embedded
    private Address address;

    public Doctor(DoctorCreateDTO doctorCreateDTO) {
        this.created_at = LocalDateTime.now();
        this.active = true;
        this.name = doctorCreateDTO.getName();
        this.email = doctorCreateDTO.getEmail();
        this.cpf = doctorCreateDTO.getCpf();
        this.phone = doctorCreateDTO.getPhone();
        this.speciality = doctorCreateDTO.getSpeciality();
        this.address = new Address(doctorCreateDTO.getAddress());
    }
}
