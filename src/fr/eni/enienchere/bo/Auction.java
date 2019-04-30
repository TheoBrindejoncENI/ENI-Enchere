package fr.eni.enienchere.bo;

import lombok.Data;
import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author ehourman2019
 *
 */
@Data
@Entity
@Table(name = "ENCHERES")
public class Auction implements Serializable {

    @ManyToOne
    @JoinColumn(name="no_utilisateur")
    private User user;

    @ManyToOne
    @JoinColumn(name="no_article")
    private Article article;

    @Column(name = "date_enchere")
    private LocalDate date;

    @Column(name = "montant_enchere")
    private int price;

}
