package lesson35.demo;

import lesson35.controller.UserController;
import lesson35.model.User;
import lesson35.model.UserType;

public class DemoUser {
    public static void main(String[] args) {

        UserController userController = new UserController();

        User user = new User("Oleg", "0000", "Ukraine", UserType.USER);

        System.out.println(userController.registerUser(user));

    }
}
