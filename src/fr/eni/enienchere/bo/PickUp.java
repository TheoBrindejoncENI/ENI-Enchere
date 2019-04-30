package fr.eni.enienchere.bo;

import lombok.Data;

import javax.persistence.*;

/**
 *
 * @author ehourman2019
 *
 */
@Data
@Entity(name = "RETRAITS")
public class PickUp {

    @Column(name = "no_article")
    private Article article;

    @Column(name = "rue")
    private String street;

    @Column(name = "code_postale")
    private String postalCode;

    @Column(name = "ville")
    private String city;

}
