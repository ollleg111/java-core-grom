package lesson35.demo;

import lesson35.controller.OrderController;
import lesson35.model.Hotel;
import lesson35.model.Order;
import lesson35.model.Room;
import lesson35.model.User;
import lesson35.repository.OrderDAO;
import lesson35.repository.RoomDAO;
import lesson35.repository.UserDAO;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DemoOrder {
    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO();
        RoomDAO roomDAO = new RoomDAO();
        OrderDAO orderDAO = new OrderDAO();

        User user0 = null;
        try {
            user0 = userDAO.findById(201);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Room room0 = null;
        try {
            room0 = roomDAO.findById(312);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Date dateFrom = new Date();

        int bookingDays = 2;

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(dateFrom);
        gregorianCalendar.add(Calendar.DAY_OF_MONTH, bookingDays);

        Date dateTo = gregorianCalendar.getTime();

        double moneyPaid = (room0 != null ? room0.getPrice() : 0) * bookingDays;

        Order order0 = new Order(user0, room0, dateFrom, dateTo, moneyPaid);

        try {
            orderDAO.save(order0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user1 = null;
        try {
            user1 = userDAO.findById(202);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Room room1 = null;
        try {
            room1 = roomDAO.findById(310);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Order order1 = new Order(user1, room1, dateFrom, dateTo, moneyPaid);

        try {
            orderDAO.save(order1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user2 = null;
        try {
            user2 = userDAO.findById(203);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Room room2 = null;
        try {
            room2 = roomDAO.findById(301);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Order order2 = new Order(user2, room2, dateFrom, dateTo, moneyPaid);

        try {
            orderDAO.save(order2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user3 = null;
        try {
            user3 = userDAO.findById(204);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Room room3 = null;
        try {
            room3 = roomDAO.findById(302);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Order order3 = new Order(user3, room3, dateFrom, dateTo, moneyPaid);

        try {
            orderDAO.save(order3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user4 = null;
        try {
            user4 = userDAO.findById(205);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Room room4 = null;
        try {
            room4 = roomDAO.findById(303);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Order order4 = new Order(user4, room4, dateFrom, dateTo, moneyPaid);

        try {
            orderDAO.save(order4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        for users
        */
        OrderController orderController = new OrderController();

        Hotel hotel0 = new Hotel("AAA", "Ukraine", "Uman", "PokerFace");

        try {
            orderController.bookRoom(room0.getId(), user0.getId(), hotel0.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Hotel hotel1 = new Hotel("BBB", "Ukraine", "Uman", "PokerFace");

        try {
            orderController.bookRoom(room0.getId(), user0.getId(), hotel1.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            orderController.cancelReservation(room0.getId(), user0.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(orderDAO.getAll());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
