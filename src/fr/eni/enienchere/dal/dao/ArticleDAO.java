package fr.eni.enienchere.dal.dao;

import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.User;
import fr.eni.enienchere.dal.ConnectionProvider;
import fr.eni.enienchere.dal.exception.DALException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 *
 * @author ehourman2019
 *
 */
public class ArticleDAO {

    /**
     * Insert a article in bdd
     * @param article
     * @throws DALException
     */
    public void insert(Article article) throws DALException {
        Session session = ConnectionProvider.session;
        session.beginTransaction();
        session.save(article);
        session.getTransaction().commit();
    }

    /**
     * Select all article in bdd
     * @return
     * @throws DALException
     */
    public List<Article> selectAll() throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM UTILISATEURS");
        List<Article> articles = q.getResultList();
        return articles;
    }

    /**
     * Select article with id
     * @param id
     * @return
     * @throws DALException
     */
    public List<Article> selectById(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM UTILISATEURS WHERE idUser=" + id);
        List<Article> articles = q.getResultList();
        return articles;
    }

    /**
     * Update article in bdd
     * @param id
     * @throws DALException
     */
    public void update(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Article article = (Article) session.get(Article.class, id);
        session.beginTransaction();
        session.saveOrUpdate(article);
        session.getTransaction().commit();
    }

    /**
     * Delete article in bdd
     * @param id
     * @throws DALException
     */
    public void delete(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Article article = (Article) session.get(Article.class, id);
        session.beginTransaction();
        session.delete(article);
        session.getTransaction().commit();
    }
}
