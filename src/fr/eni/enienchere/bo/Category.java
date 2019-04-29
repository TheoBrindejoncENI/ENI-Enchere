package fr.eni.enienchere.bo;

import lombok.Data;

import javax.persistence.*;

/**
 *
 * @author ehourman2019
 *
 */
@Data
@Entity(name = "CATEGORIES")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_categorie")
    private Long idCategory;

    @Column(name = "libelle")
    private String title;

}
