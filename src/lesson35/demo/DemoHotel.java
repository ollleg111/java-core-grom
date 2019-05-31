package lesson35.demo;

import lesson35.controller.HotelController;
import lesson35.controller.UserController;
import lesson35.model.Hotel;
import lesson35.model.User;
import lesson35.model.UserType;

public class DemoHotel {
    public static void main(String[] args) {
        HotelController hotelController = new HotelController();
        UserController userController = new UserController();
        User user = new User("userName", "password", "country", UserType.USER);
        Hotel hotel = new Hotel("name", "country", "city", "street");

        try {
            userController.registerUser(user);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            hotelController.addHotel(hotel);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
