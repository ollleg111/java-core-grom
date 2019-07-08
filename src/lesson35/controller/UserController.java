package lesson35.controller;

import lesson35.exceptions.BadRequestException;
import lesson35.exceptions.UserNotFoundException;
import lesson35.repository.UserDAO;
import lesson35.service.UserService;
import lesson35.model.User;

import java.nio.file.AccessDeniedException;

public class UserController {

    private UserService userService = new UserService();

    public User registerUser(User user) throws Exception {
        return userService.registerUser(user);
    }

    public void login(String userName, String password) throws Exception {
        validate(userName, password);
        Session.setAuthorizedUser(userService.login(userName, password));
    }

    public void logout() throws Exception {
        userService.logout();
    }

    //TODO хз
    public void removeAccount(User user) throws Exception {
        if (!UserDAO.isAdmin())
            throw new AccessDeniedException("User do not have permission");
        userService.removeAccount(user);
    }

    private void validate(String userName, String password) throws Exception {
        if (userName == null || userName.isEmpty())
            throw new UserNotFoundException("User does not exist");
        if (password == null || password.isEmpty())
            throw new BadRequestException("Password is wrong");
    }
}
