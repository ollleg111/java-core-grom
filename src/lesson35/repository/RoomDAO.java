package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.Hotel;
import lesson35.model.Room;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class RoomDAO extends GeneralDAO<Room> {

    public RoomDAO() {
        super(Constants.ROOM_DB_PATH);
    }

    private HotelDAO hotelDAO = new HotelDAO();
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public void deleteRoom(Room room) throws Exception {
        super.remove(room);
    }

    public Room addRoom(Room room) throws Exception {
        return super.save(room);
    }

    public void changeAvailableDate(long roomId, Date date) {
        Room room = findById(roomId);
        room.setDateAvailableFrom(date);
    }

    @Override
    public Room mapping(String object) {
        String[] arr = object.split("([,][ ])");

        long id = Long.parseLong(arr[0]);
        int numberOfGuests = Integer.parseInt(arr[1]);
        double price = Double.parseDouble(arr[2]);
        boolean breakfastIncluded = Boolean.parseBoolean(arr[3]);
        boolean petsAllowed = Boolean.parseBoolean(arr[4]);

        Date dateAvailableFrom = null;
        try {
            dateAvailableFrom = simpleDateFormat.parse(arr[5]);
        } catch (ParseException e) {
            System.out.println("Wrong date format");
        }

        Hotel hotel = hotelDAO.findById(Long.parseLong(arr[6]));

        return new Room(id, numberOfGuests, price, breakfastIncluded, petsAllowed, dateAvailableFrom, hotel);
    }

    /*
    public Room(long id, int numberOfGuests, double price, boolean breakfastIncluded, boolean petsAllowed,
    Date dateAvailableFrom, Hotel hotel) {
    */
    @Override
    public String toFile(Room object) {
        return object.getId() + ", "
                + object.getNumberOfGuests() + ", "
                + object.getPrice() + ", "
                + object.isBreakfastIncluded() + ", "
                + object.isPetsAllowed() + ", "
                + object.getDateAvailableFrom() + ", "
                + object.getHotel().getId();
    }
}