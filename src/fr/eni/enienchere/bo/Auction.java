package fr.eni.enienchere.bo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Auction {

    private User user;
    private Article article;
    private LocalDate date;
    private int price;

}
