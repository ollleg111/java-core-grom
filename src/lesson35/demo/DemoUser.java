package lesson35.demo;

import lesson35.controller.UserController;
import lesson35.model.User;
import lesson35.model.UserType;
import lesson35.repository.UserDAO;

public class DemoUser {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        User user0 = new User("Oleg", "2301", "Ukraine", UserType.USER);
        User user1 = new User("aaa", "0000", "Ukraine", UserType.USER);
        User user2 = new User("bbb", "1111", "Ukraine", UserType.USER);
        User user3 = new User("ccc", "2222", "Ukraine", UserType.USER);
        User user4 = new User("ddd", "3333", "Ukraine", UserType.ADMIN);

        try {
            userDAO.save(user0);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            userDAO.save(user1);
        }catch (Exception e){
            e.printStackTrace();
        }try {
            userDAO.save(user2);
        }catch (Exception e){
            e.printStackTrace();
        }try {
            userDAO.save(user3);
        }catch (Exception e){
            e.printStackTrace();
        }try {
            userDAO.save(user4);
        }catch (Exception e){
            e.printStackTrace();
        }

        UserController userController = new UserController();
        User user5= new User("ddd", "2222", "Ukraine", UserType.USER);
        User user6 = new User("eee", "2222", "Ukraine", UserType.USER);
        User user7 = new User("fff", "2222", "Ukraine", UserType.USER);

        try {
            userController.registerUser(user5);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            userController.registerUser(user6);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            userController.registerUser(user7);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            userController.login(user6.getUserName(),user6.getPassword());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            userController.login(user5.getUserName(),user5.getPassword());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            userController.logout();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
