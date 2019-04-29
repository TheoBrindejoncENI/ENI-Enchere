package fr.eni.enienchere.bo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Article {

    private Long idArticle;
    private String name;
    private String description;
    private LocalDate auctionStartDate;
    private LocalDate auctionEnDate;
    private int initPrice;
    private int sellPrice;
    private User user;
    private Category category;

}
