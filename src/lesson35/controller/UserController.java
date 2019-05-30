package lesson35.controller;

import lesson35.exceptions.BadRequestException;
import lesson35.exceptions.InternalServerException;
import lesson35.exceptions.UserNotFoundException;
import lesson35.service.UserService;
import lesson35.model.User;

import java.util.Map;
import java.util.logging.Filter;

public class UserController {
    private UserService userService = new UserService();

    public User registerUser(User user) throws Exception {
        return userService.registerUser(user);
    }

    public void logout() throws InternalServerException {
        //TODO
    }

    public void login(String userName, String password) throws Exception {
        validate(userName, password);
        userService.login(userName, password);
    }

    private void validate(String userName, String password) throws Exception {
        if (userName == null)
            throw new UserNotFoundException("User does not exist");
        if (password == null)
            throw new BadRequestException("Password is wrong");
    }
}
