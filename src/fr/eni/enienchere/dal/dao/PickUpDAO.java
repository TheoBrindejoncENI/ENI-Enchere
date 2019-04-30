package fr.eni.enienchere.dal.dao;

import fr.eni.enienchere.bo.PickUp;
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
public class PickUpDAO {
    /**
     * Insert a category in bdd
     * @param pickUp
     * @throws DALException
     */
    public void insert(PickUp pickUp) throws DALException {
        Session session = ConnectionProvider.session;
        session.beginTransaction();
        session.save(pickUp);
        session.getTransaction().commit();
    }

    /**
     * Select all category in bdd
     * @return
     * @throws DALException
     */
    public List<PickUp> selectAll() throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM RETRAITS ");
        List<PickUp> pickUps = q.getResultList();
        return pickUps;
    }

    /**
     * Select category with id
     * @param id
     * @return
     * @throws DALException
     */
    public List<PickUp> selectById(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM RETRAITS WHERE article.idArticle=" + id);
        List<PickUp> pickUps = q.getResultList();
        return pickUps;
    }

    /**
     * Update category in bdd
     * @param pickUp
     * @throws DALException
     */
    public void update(PickUp pickUp) throws DALException {
        Session session = ConnectionProvider.session;
        session.beginTransaction();
        session.saveOrUpdate(pickUp);
        session.getTransaction().commit();
    }

    /**
     * Delete category in bdd
     * @param pickUp
     * @throws DALException
     */
    public void delete(PickUp pickUp) throws DALException {
        Session session = ConnectionProvider.session;;
        session.beginTransaction();
        session.delete(pickUp);
        session.getTransaction().commit();
    }
}
