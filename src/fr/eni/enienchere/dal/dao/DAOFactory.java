package fr.eni.enienchere.dal.dao;

/**
 *
 * @author ehourman2019
 *
 */
public class DAOFactory {

    public static UserDAO getUserDAO() {
        return new UserDAO();
    }

    public static  ArticleDAO getArticleDAO() {
        return new ArticleDAO();
    }
}
