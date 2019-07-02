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

        User user0 = userDAO.findById(201);
        Room room0 = roomDAO.findById(312);

        Date dateFrom = new Date();

        int bookingDays = 2;

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(dateFrom);
        gregorianCalendar.add(Calendar.DAY_OF_MONTH, bookingDays);

        Date dateTo = gregorianCalendar.getTime();

        double moneyPaid = room0.getPrice() * bookingDays;

        Order order0 = new Order(user0, room0, dateFrom, dateTo, moneyPaid);

        try {
            orderDAO.save(order0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user1 = userDAO.findById(202);
        Room room1 = roomDAO.findById(310);

        Order order1 = new Order(user1, room1, dateFrom, dateTo, moneyPaid);

        try {
            orderDAO.save(order1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user2 = userDAO.findById(203);
        Room room2 = roomDAO.findById(301);

        Order order2 = new Order(user2, room2, dateFrom, dateTo, moneyPaid);

        try {
            orderDAO.save(order2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user3 = userDAO.findById(204);
        Room room3 = roomDAO.findById(302);

        Order order3 = new Order(user3, room3, dateFrom, dateTo, moneyPaid);

        try {
            orderDAO.save(order3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user4 = userDAO.findById(205);
        Room room4 = roomDAO.findById(303);

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
            orderController.cancelReservation(room0.getId(),user0.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(orderDAO.getAll());
        //TODO
    }
}
