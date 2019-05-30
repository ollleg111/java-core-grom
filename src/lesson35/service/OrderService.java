package lesson35.service;

import lesson35.exceptions.BadRequestException;
import lesson35.model.Order;
import lesson35.repository.OrderDAO;
import lesson35.repository.RoomDAO;
import lesson35.repository.UserDAO;

import java.util.Date;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();
    private UserDAO userDAO = new UserDAO();
    private RoomDAO roomDAO = new RoomDAO();

    /*
    for users
     */
    public void bookRoom(long roomId, long userId, Date dateFrom, Date dateTo, double moneyPaid) throws Exception {

        Order order = new Order(userDAO.findById(userId), roomDAO.findById(roomId), dateFrom, dateTo, moneyPaid);
        validate(order);
        orderDAO.create(order);
    }

    /*
    for users
     */
    public void cancelReservation(long roomId, long userId) throws Exception {
        for (Order order : orderDAO.getAll()) {
            if (order.getRoom().getId() == roomId &&
                    order.getUser().getId() == userId)
                orderDAO.remove(order);
        }
        throw new BadRequestException("Wrong cancellation");
    }

    private void validate(Order order) throws BadRequestException {
        if (order.getUser() == null)
            throw new BadRequestException("Wrong user");

        if (order.getRoom() == null)
            throw new BadRequestException("Wrong room");

        if (order.getMoneyPaid() <= 0)
            throw new BadRequestException("Wrong money in  count");

        if (order.getDateTo() == null)
            throw new BadRequestException("Wrong date start");

        if (order.getDateFrom() == null)
            throw new BadRequestException("Wrong date over");

    }
}
