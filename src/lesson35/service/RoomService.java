package lesson35.service;

import lesson35.exceptions.BadRequestException;
import lesson35.model.Filter;
import lesson35.model.Room;
import lesson35.repository.RoomDAO;

import java.io.IOException;
import java.util.ArrayList;

public class RoomService {

    private RoomDAO roomDAO = new RoomDAO();

    /*
    only for administrators
     */
    public void addRoom(Room room) throws Exception {
        validate(room);
        roomDAO.addRoom(room);
    }

    /*
    only for administrators
     */
    public void deleteRoom(long roomId) throws Exception {
        roomDAO.deleteRoom(roomDAO.findById(roomId));
    }

    /*
    for users
     */
    public ArrayList<Room> findRooms(Filter filter) throws IOException {
        ArrayList<Room> findRooms = roomDAO.getAll();
        for (Room room : findRooms) {
            if (((Integer) filter.getNumberOfGuests() == null || filter.getNumberOfGuests() == room.getNumberOfGuests()) &&
                    ((Double) filter.getPrice() == null || filter.getPrice() == room.getPrice()) &&
                    ((Boolean) filter.isBreakfastIncluded() == null || filter.isBreakfastIncluded() == room.isBreakfastIncluded()) &&
                    ((Boolean) filter.isPetsAllowed() == null || filter.isPetsAllowed() == room.isPetsAllowed()) &&
                    (filter.getDateAvailableFrom() == null || filter.getDateAvailableFrom() == room.getDateAvailableFrom()) &&
                    (filter.getCountry() == null || filter.getCountry().equals(room.getHotel().getCountry())) &&
                    (filter.getCity() == null || filter.getCity().equals(room.getHotel().getCity())));
                findRooms.add(room);
        }
        return findRooms;
    }

    private void validate(Room room) throws Exception {
        if (room.getHotel() == null)
            throw new BadRequestException("Wrong hotel name");

        if (!room.isPetsAllowed())
            throw new BadRequestException("Pets not allowed");

        if (!room.isBreakfastIncluded())
            throw new BadRequestException("Breakfast not included");

        if (room.getDateAvailableFrom() == null)
            throw new BadRequestException("Wrong enter date");
    }
}
