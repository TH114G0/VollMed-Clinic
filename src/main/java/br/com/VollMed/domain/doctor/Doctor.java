package br.com.VollMed.domain.doctor;

import br.com.VollMed.domain.address.Address;
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

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private Speciality speciality;
}
