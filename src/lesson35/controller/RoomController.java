package lesson35.controller;

import lesson35.model.Room;
import lesson35.service.RoomService;

public class RoomController {
    private RoomService roomService = new RoomService();

    /*
    only for administrators
     */
    public void addRoom(Room room) throws Exception{
        roomService.addRoom(room);
    }

    /*
    only for administrators
     */
    public void deleteRoom(long roomId) throws Exception{
        roomService.deleteRoom(roomId);
    }
}
