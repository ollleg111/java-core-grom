package lesson35.controller;

import lesson35.service.OrderService;

import java.util.Date;

public class OrderController {
    private OrderService orderService = new OrderService();

    /*
     for users
      */
    public void bookRoom(long roomId, long userId, long hotelId) throws Exception {
        orderService.bookRoom(roomId, userId, hotelId);
    }

    /*
    for users
     */
    public void cancelReservation(long roomId, long userId) throws Exception {
        orderService.cancelReservation(roomId, userId);
    }
}
