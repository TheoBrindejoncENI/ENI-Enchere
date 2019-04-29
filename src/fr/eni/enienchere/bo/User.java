package fr.eni.enienchere.bo;

import lombok.Data;

@Data
public class User {

    private Long idUser;
    private String userName;
    private String lastName;
    private String firstName;
    private String email;
    private int phoneNumber;
    private String street;
    private int postalCode;
    private String city;
    private String password;
    private Long money;
    private boolean userAdmin;

}
