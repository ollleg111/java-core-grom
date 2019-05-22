package lesson35.service;

import lesson35.repository.OrderDAO;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();

    public void bookRoom(long roomId, long userId, long hotelId) throws Exception{

        orderDAO.bookRoom(roomId, userId, hotelId);
    }

    public void cancelReserve(long roomId, long userId) throws Exception{

        orderDAO.cancelReserve(roomId, userId);
    }
}
