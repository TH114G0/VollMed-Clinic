package br.com.VollMed.domain.Address;

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
}
