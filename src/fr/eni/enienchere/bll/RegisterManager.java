package fr.eni.enienchere.bll;

import fr.eni.enienchere.bll.exception.BLLException;
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

            checkUser(userName, lastName, firstName, email, phoneNumber, street, postalCode, city, password);

            userDAO.insert(user);
        } catch (DALException e) {
            e.printStackTrace();
        }
    }

    public User checkUser(String userName, String lastName, String firstName, String email, String phoneNumber,
                          String street, String postalCode, String city, String password) {



        return user;
    }
}
