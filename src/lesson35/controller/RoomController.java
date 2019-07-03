package lesson35.controller;

import lesson35.model.Filter;
import lesson35.model.Room;
import lesson35.repository.UserDAO;
import lesson35.service.RoomService;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;

public class RoomController {
    private RoomService roomService = new RoomService();

    /*
    only for administrators
     */
    public void addRoom(Room room) throws Exception {
        if (!UserDAO.isAdmin())
            throw new AccessDeniedException("User do not have permission");
        roomService.addRoom(room);
    }

    /*
    only for administrators
     */
    public void deleteRoom(long roomId) throws Exception {
        if (!UserDAO.isAdmin())
            throw new AccessDeniedException("User do not have permission");
        roomService.deleteRoom(roomId);
    }

    /*
    for users
    */
    public ArrayList<Room> findRooms(Filter filter) {
        if (filter != null)
            return roomService.findRooms(filter);
        return null;
    }
}
