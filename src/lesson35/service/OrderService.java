package lesson35.service;

import lesson35.exceptions.BadRequestException;
import lesson35.model.Order;
import lesson35.model.Room;
import lesson35.model.User;
import lesson35.repository.OrderDAO;
import lesson35.repository.RoomDAO;
import lesson35.repository.UserDAO;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();
    private UserDAO userDAO = new UserDAO();
    private RoomDAO roomDAO = new RoomDAO();

    /*
    for users
     */
    public void bookRoom(long roomId, long userId, long hotelId) throws Exception {

        User user = userDAO.findById(userId);
        Room room = roomDAO.findById(roomId);

        if (room.getHotel().getId() != hotelId)
            throw new BadRequestException("Not found this hotel id:" + hotelId +
                    " with room id: " + roomId);

        Date dateFrom = new Date();

        int bookingDays = 2;
        //TODO  -хз-

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(dateFrom);
        gregorianCalendar.add(Calendar.DAY_OF_MONTH, bookingDays);

        Date dateTo = gregorianCalendar.getTime();

        double moneyPaid = room.getPrice() * bookingDays;

        /*
        public Order(User user, Room room, Date dateFrom, Date dateTo, double moneyPaid) {
         */
        Order order = new Order(user, room, dateFrom, dateTo, moneyPaid);

        roomDAO.changeAvailableDate(roomId, dateTo);
        orderDAO.save(order);
    }

    /*
    for users
     */
    public void cancelReservation(long roomId, long userId) throws Exception {
        for (Order order : orderDAO.getAll()) {
            if (order.getRoom().getId() == roomId &&
                    order.getUser().getId() == userId){

                roomDAO.changeAvailableDate(roomId, new Date());
                orderDAO.remove(order);
            }
        }
        throw new BadRequestException("Wrong cancellation");
    }
}
