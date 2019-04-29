package fr.eni.enienchere.bo;

import lombok.Data;
/**
 *
 * @author ehourman2019
 *
 */
@Data
public class PickUp {

    private Article article;
    private String street;
    private String postalCode;
    private String city;

}
