package lesson35.demo;

import lesson35.controller.HotelController;
import lesson35.model.Hotel;
import lesson35.repository.HotelDAO;

public class DemoHotel {
    public static void main(String[] args) {
        HotelDAO hotelDAO = new HotelDAO();

        Hotel hotel0 = new Hotel("Five", "Ukraine", "Dnipro", "Rabochaya");
        Hotel hotel1 = new Hotel("Six", "Ukraine", "Kiev", "First");
        Hotel hotel2 = new Hotel("Ten", "Ukraine", "Dnipro", "Second");
        Hotel hotel3 = new Hotel("Nine", "Ukraine", "Lviv", "Third");
        Hotel hotel4 = new Hotel("MMM", "Ukraine", "Uman", "PokerFace");

        try {
            hotelDAO.save(hotel0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            hotelDAO.save(hotel1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            hotelDAO.save(hotel2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            hotelDAO.save(hotel3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            hotelDAO.save(hotel4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        for users
         */
        HotelController hotelController = new HotelController();
        try {
            hotelController.findHotelByCity("Dnipro");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            hotelController.findHotelByCity("Kiev");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            hotelController.findHotelByCity("Lviv");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            hotelController.findHotelByName("First");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            hotelController.findHotelByName("Second");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
