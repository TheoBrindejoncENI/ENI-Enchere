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
  public void insert(User user) throws DALException {
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
    public List<User> selectAll() throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM UTILISATEURS");
        List<User> users = q.getResultList();
       return users;
    }

    /**
     * Select user with id
     * @param id
     * @return
     * @throws DALException
     */
    public List<User> selectById(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM UTILISATEURS WHERE idUser=" + id);
        List<User> users = q.getResultList();
        return users;
    }

    /**
     * Update user in bdd
     * @param id
     * @throws DALException
     */
    public void update(Long id) throws DALException {
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
    public void delete(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        User user = (User) session.get(User.class, id);
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
    }

}
