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
@Entity(name = "UTILISATEURS")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no_utilisateur")
    private Long idUser;

    @Column(name = "pseudo")
    private String userName;

    @Column(name = "nom")
    private String lastName;

    @Column(name = "prenom")
    private String firstName;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private int phoneNumber;

    @Column(name = "rue")
    private String street;

    @Column(name = "code_postal")
    private String postalCode;

    @Column(name = "ville")
    private String city;

    @Column(name = "mot_de_passe")
    private String password;

    @Column(name = "credit")
    private Long money;

    @Column(name = "administrateur")
    private boolean userAdmin;
}
