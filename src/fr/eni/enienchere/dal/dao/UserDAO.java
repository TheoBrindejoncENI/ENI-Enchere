package fr.eni.enienchere.dal.dao;

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
public class UserDAO {

    /**
     * Insert a user in bdd
     * @param user
     * @throws DALException
     */
    void insert(User user) throws DALException {
        Session session = ConnectionProvider.session;
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    /**
     * Select all user in bdd
     * @return
     * @throws DALException
     */
    List<User> selectAll() throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("SELECT * FROM UTILISATEURS");
        List<User> users = q.getResultList();
       return users;
    }

    /**
     * Select user with id
     * @param id
     * @return
     * @throws DALException
     */
    List<User> selectById(int id) throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("SELECT * FROM UTILISATEURS WHERE no_utilisateur = " + id);
        List<User> users = q.getResultList();
        return users;
    }

    /**
     * Update user in bdd
     * @param id
     * @throws DALException
     */
    void update(int id) throws DALException {
        Session session = ConnectionProvider.session;
        User user = (User) session.get(User.class, id);
        session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit();
    }

    /**
     * Delete user in bdd
     * @param id
     * @throws DALException
     */
    void delete(int id) throws DALException {
        Session session = ConnectionProvider.session;
        User user = (User) session.get(User.class, id);
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
    }

}
