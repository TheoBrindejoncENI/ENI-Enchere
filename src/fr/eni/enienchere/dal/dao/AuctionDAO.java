package fr.eni.enienchere.dal.dao;

import fr.eni.enienchere.bo.Article;
import fr.eni.enienchere.bo.Auction;
import fr.eni.enienchere.bo.User;
import fr.eni.enienchere.dal.ConnectionProvider;
import fr.eni.enienchere.dal.exception.DALException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class AuctionDAO {

    /**
     * Insert a auction in bdd
     * @param auction
     * @throws DALException
     */
    public void insert(Auction auction) throws DALException {
        Session session = ConnectionProvider.session;
        session.beginTransaction();
        session.save(auction);
        session.getTransaction().commit();
    }

    /**
     * Select all auction in bdd
     * @return
     * @throws DALException
     */
    public List<Auction> selectAll() throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM UTILISATEURS");
        List<Auction> auction = q.getResultList();
        return auction;
    }

    /**
     * Select auction with id user
     * @param id
     * @return
     * @throws DALException
     */
    public List<Auction> selectByIdUser(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM ENCHERES WHERE user.idUser=" + id);
        List<Auction> auction = q.getResultList();
        return auction;
    }

    /**
     * Select auction with id Article
     * @param id
     * @return
     * @throws DALException
     */
    public List<Auction> selectByIdArticle(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM ENCHERES WHERE article.idArticle=" + id);
        List<Auction> auction = q.getResultList();
        return auction;
    }

    /**
     * Update article in bdd
     * @param auction
     * @throws DALException
     */
    public void update(Auction auction) throws DALException {
        Session session = ConnectionProvider.session;
        session.beginTransaction();
        session.saveOrUpdate(auction);
        session.getTransaction().commit();
    }

    /**
     * Delete article in bdd
     * @param auction
     * @throws DALException
     */
    public void delete(Auction auction) throws DALException {
        Session session = ConnectionProvider.session;
        session.beginTransaction();
        session.delete(auction);
        session.getTransaction().commit();
    }
}
