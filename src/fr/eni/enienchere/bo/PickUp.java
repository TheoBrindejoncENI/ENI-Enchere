package fr.eni.enienchere.bo;

import lombok.Data;

@Data
public class PickUp {

    private Article article;
    private String street;
    private String postalCode;
    private String city;

}
