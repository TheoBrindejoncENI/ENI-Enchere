package fr.eni.enienchere.dal.dao;

import fr.eni.enienchere.dal.dao.JdbcImpl.AricleDAOJdbcImpl;

public interface ArticleDAO {

    public static ArticleDAO getArticleDao() {
        return new AricleDAOJdbcImpl();
    }

}
