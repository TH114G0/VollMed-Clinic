package br.com.VollMed.domain.address;

import br.com.VollMed.dto.AddressDTO;
import br.com.VollMed.util.MaskFormatter;
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

    public String getZip_code() {
        return MaskFormatter.maskZipCode(this.zip_code);
    }

    public void update(AddressDTO address) {
        if (address.getCity() != null && address.getCity().isBlank()) {
            this.city = address.getCity();
        }
        if (address.getStreet() != null && address.getStreet().isBlank()) {
            this.street = address.getStreet();
        }
        if (address.getState() != null && !address.getState().isBlank()) {
            this.state = address.getState();
        }
        if(address.getNeighborhood() != null && !address.getNeighborhood().isBlank()) {
            this.neighborhood = address.getNeighborhood();
        }
        if(address.getZip_code() != null && !address.getZip_code().isBlank()) {
            this.zip_code = address.getZip_code();
        }
        if(address.getState_code() != null && !address.getState_code().isBlank()) {
            this.state_code = address.getState_code();
        }
        if (address.getComplement() != null && !address.getComplement().isBlank()) {
            this.complement = address.getComplement();
        }
        if (address.getNumber() != null && !address.getNumber().isBlank()) {
            this.number = address.getNumber();
        }
    }
}
