package lesson35.service;

import lesson35.model.User;
import lesson35.repository.UserDAO;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public User registerUser(User user){

        //check business logic
        //if logic ok
        return userDAO.registerUser(user);
    }
}
