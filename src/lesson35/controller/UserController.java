package lesson35.controller;

import lesson35.service.UserService;
import lesson35.model.User;

import java.util.Map;
import java.util.logging.Filter;

public class UserController {

    private UserService userService = new UserService();

    public User registerUser(User user) {

        return userService.registerUser(user);
    }




    private void findHotelByName(String name) {

    }

    private void findHotelByCity(String city) {

    }

//    private Map <User>findRooms(Filter filter) {
//        return null;
//    }

    private void bookRoom(long roomId, long userId, long hotelId) {

    }

    private void cancelReservation(long roomId, long userId) {

    }



    private void login(String userName, String password) {

    }

    private void logout() {

    }
}
