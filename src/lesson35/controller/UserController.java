package lesson35.controller;

import lesson35.exceptions.BadRequestException;
import lesson35.exceptions.UserNotFoundException;
import lesson35.service.UserService;
import lesson35.model.User;

public class UserController {
    private UserService userService = new UserService();

    public User registerUser(User user) throws Exception {
        return userService.registerUser(user);
    }

    public void login(String userName, String password) throws Exception {
        validate(userName, password);
        userService.login(userName, password);
    }

    public void logout(){
        userService.logout();
    }

    private void validate(String userName, String password) throws Exception {
        if (userName == null)
            throw new UserNotFoundException("User does not exist");
        if (password == null)
            throw new BadRequestException("Password is wrong");
    }
}
