package fr.eni.enienchere.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author ehourman2019
 *
 */
@Data
@Entity(name = "RETRAITS")
public class PickUp  implements Serializable {

    @Column(name = "no_article")
    private Article article;

    @Column(name = "rue")
    private String street;

    @Column(name = "code_postale")
    private String postalCode;

    @Column(name = "ville")
    private String city;

}
