package fr.eni.enienchere.bll;

import fr.eni.enienchere.bo.User;
import fr.eni.enienchere.dal.dao.DAOFactory;
import fr.eni.enienchere.dal.dao.UserDAO;
import fr.eni.enienchere.dal.exception.DALException;

public class RegisterManager {

    private static UserDAO userDAO;

    public RegisterManager() {
        userDAO = DAOFactory.getUserDAO();
    }

    public void insertUser(String userName, String lastName, String firstName, String email, String phoneNumber,
                           String street, String postalCode, String city, String password) {
        try  {
            User user = new User();


            userDAO.insert(user);
        } catch (DALException e) {
            e.printStackTrace();
        }

    }
}
