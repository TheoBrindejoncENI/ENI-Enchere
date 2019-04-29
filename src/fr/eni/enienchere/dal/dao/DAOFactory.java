package fr.eni.enienchere.dal.dao;

import fr.eni.enienchere.dal.dao.JdbcImpl.AricleDAOJdbcImpl;
import fr.eni.enienchere.dal.dao.JdbcImpl.UserDAOJdbcImpl;

/**
 *
 * @author ehourman2019
 *
 */
public class DAOFactory {

    public static UserDAO getUserDAO() {
        return new UserDAOJdbcImpl();
    }

    public static  ArticleDAO getArticleDAO() {
        return new AricleDAOJdbcImpl();
    }

}
