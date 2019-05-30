package lesson35.demo;

import lesson35.controller.UserController;
import lesson35.model.User;
import lesson35.model.UserType;

public class DemoUser {
    public static void main(String[] args) {

        UserController userController = new UserController();

        User user = new User("Oleg", "2301", "Ukraine", UserType.USER);

        try {
            System.out.println(userController.registerUser(user));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
