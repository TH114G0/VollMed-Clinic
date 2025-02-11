package br.com.VollMed.dto;

import br.com.VollMed.domain.doctor.Speciality;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DoctorCreateDTO {

    @NotBlank
    private String name;

    @Email
    private String email;

    @NotBlank
    private String cpf;

    @NotBlank
    private String phone;

    @NotNull
    private Speciality speciality;

    @NotNull
    @Valid
    private AddressDTO address;


}
