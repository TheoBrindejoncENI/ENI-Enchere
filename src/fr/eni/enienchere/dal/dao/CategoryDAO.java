package fr.eni.enienchere.dal.dao;

import fr.eni.enienchere.bo.Category;
import fr.eni.enienchere.dal.ConnectionProvider;
import fr.eni.enienchere.dal.exception.DALException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class CategoryDAO {

    /**
     * Insert a category in bdd
     * @param category
     * @throws DALException
     */
    public void insert(Category category) throws DALException {
        Session session = ConnectionProvider.session;
        session.beginTransaction();
        session.save(category);
        session.getTransaction().commit();
    }

    /**
     * Select all category in bdd
     * @return
     * @throws DALException
     */
    public List<Category> selectAll() throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM CATEGORIES");
        List<Category> categories = q.getResultList();
        return categories;
    }

    /**
     * Select category with id
     * @param id
     * @return
     * @throws DALException
     */
    public List<Category> selectById(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Query q = session.createQuery("FROM CATEGORIES WHERE idCategory=" + id);
        List<Category> categories = q.getResultList();
        return categories;
    }

    /**
     * Update category in bdd
     * @param id
     * @throws DALException
     */
    public void update(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Category category = (Category) session.get(Category.class, id);
        session.beginTransaction();
        session.saveOrUpdate(category);
        session.getTransaction().commit();
    }

    /**
     * Delete category in bdd
     * @param id
     * @throws DALException
     */
    public void delete(Long id) throws DALException {
        Session session = ConnectionProvider.session;
        Category category = (Category) session.get(Category.class, id);
        session.beginTransaction();
        session.delete(category);
        session.getTransaction().commit();
    }
}
