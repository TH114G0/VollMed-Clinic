package br.com.VollMed.dto;


import br.com.VollMed.util.MaskFormatter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DoctorUpdateDTO {

    private Long id;

    private String name;

    private String email;

    private String phone;

    private AddressDTO address;

    public String getPhone() {
        return MaskFormatter.mackPhone(this.phone);
    }
}