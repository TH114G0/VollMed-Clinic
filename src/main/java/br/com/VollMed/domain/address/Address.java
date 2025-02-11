package br.com.VollMed.domain.address;

import br.com.VollMed.dto.AddressDTO;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    private String city;

    private String street;

    private String state;

    private String neighborhood;

    private String zip_code;

    private String state_code;

    private String complement;

    private String number;

    public Address(AddressDTO address) {
        this.city = address.getCity();
        this.street = address.getStreet();
        this.state = address.getState();
        this.neighborhood = address.getNeighborhood();
        this.zip_code = address.getZip_code();
        this.state_code = address.getState_code();
        this.complement = address.getComplement();
        this.number = address.getNumber();
    }
}
