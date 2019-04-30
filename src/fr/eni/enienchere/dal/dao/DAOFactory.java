package fr.eni.enienchere.dal.dao;

import fr.eni.enienchere.dal.dao.jpa.JpaArticleDAO;
import fr.eni.enienchere.dal.dao.jpa.JpaAuctionDAO;

/**
 *
 * @author ehourman2019
 *
 */
public class DAOFactory {

    public static UserDAO getUserDAO() { return new UserDAO(); }

    public static  ArticleDAO getArticleDAO() { return new JpaArticleDAO(); }

    public static CategoryDAO getCategoryDAO() {
        return new CategoryDAO();
    }

    public static AuctionDAO getAuctionDAO() { return new JpaAuctionDAO(); }

    public static PickUpDAO getPickUpDAO() { return new PickUpDAO(); }
}
