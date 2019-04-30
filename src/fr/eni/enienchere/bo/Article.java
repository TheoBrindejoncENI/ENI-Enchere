package fr.eni.enienchere.bo;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
/**
 *
 * @author ehourman2019
 *
 */
@Data
@Entity(name = "ARTICLES_VENDUS")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_Article")
    private Long idArticle;

    @Column(name = "nom_article")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "date_debut_encheres")
    private LocalDate auctionStartDate;

    @Column(name = "date_fin_encheres")
    private LocalDate auctionEndDate;

    @Column(name = "prix_initial")
    private int initPrice;

    @Column(name = "prix_vente")
    private int sellPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name="UTILISATEURS",
            joinColumns={@JoinColumn(name="no_utilisateur")},
            inverseJoinColumns={@JoinColumn(name="no_utilisateur")})
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name="CATEGORIES",
            joinColumns={@JoinColumn(name="no_categorie")},
            inverseJoinColumns={@JoinColumn(name="no_categorie")})
    private Category category;

}
