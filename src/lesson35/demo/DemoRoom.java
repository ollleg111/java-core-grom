package lesson35.demo;

import lesson35.controller.RoomController;
import lesson35.model.Filter;
import lesson35.model.Hotel;
import lesson35.model.Room;
import lesson35.repository.HotelDAO;
import lesson35.repository.RoomDAO;

import java.util.Date;

public class DemoRoom {
    public static void main(String[] args) {

        RoomDAO roomDAO = new RoomDAO();
        HotelDAO hotelDAO = new HotelDAO();

        Hotel hotel0 = new Hotel(2000, "Alexandrit", "Ukraine", "Kiev", "Odincova");

        try {
            hotelDAO.save(hotel0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Room room0 = new Room(1001, 2, 600, false,
                false, new Date(), hotel0);
        Room room1 = new Room(1002, 2, 1000.00, true,
                true, new Date(), hotel0);
        Room room2 = new Room(1003, 3, 1000.00, true,
                false, new Date(), hotel0);
        Room room3 = new Room(1004, 3, 2000, true,
                true, new Date(), hotel0);

        try {
            roomDAO.save(room0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            roomDAO.save(room1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            roomDAO.save(room2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            roomDAO.save(room3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        for users
        */
        RoomController roomController = new RoomController();
        Filter filter0 = new Filter(2, 1000, true, true, new Date(),
                "Ukraine", "Dnipro");
        try {
            System.out.println(roomController.findRooms(filter0));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Filter filter1 = new Filter(2, 1000, true, true, new Date(),
                "Ukraine", "Kiev");
        try {
            System.out.println(roomController.findRooms(filter1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
