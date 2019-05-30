package lesson35.service;

import lesson35.exceptions.BadRequestException;
import lesson35.exceptions.UserNotFoundException;
import lesson35.model.User;
import lesson35.repository.UserDAO;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    /*
    for users
     */
    public User registerUser(User user) throws Exception {
        validate(user);
        return userDAO.create(user);
    }

    /*
    for users
     */
    public User login(String userName, String password) throws Exception {
        for (User user : userDAO.getAll()) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password))
                return user;
        }
        throw new UserNotFoundException("User: " + userName + " does not exist");
    }

    /*
    for users
     */
    public void logout(){
        //TODO
    }

    private void validate(User user) throws BadRequestException {
        if (user.getUserName() == null || user.getUserName().isEmpty())
            throw new BadRequestException("Wrong user name");

        if (user.getCountry() == null || user.getCountry().isEmpty())
            throw new BadRequestException("Wrong country");

        if (user.getPassword() == null || user.getPassword().isEmpty())
            throw new BadRequestException("Wrong password");

        if (user.getUserType() == null)
            throw new BadRequestException("Wrong user type");
    }
}

