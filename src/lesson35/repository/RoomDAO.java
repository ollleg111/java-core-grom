package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.Hotel;
import lesson35.model.Room;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public Room addRoom(Room room) throws IOException {
        return super.save(room);
    }

    public void changeAvailableDate(long roomId, Date date) throws Exception {
        Room room = findById(roomId);
        room.setDateAvailableFrom(date);
    }

    @Override
    public Room mapping(String[] arr) throws IOException {
        Room room;

        try {
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

            room = new Room(id, numberOfGuests, price, breakfastIncluded, petsAllowed, dateAvailableFrom, hotel);

        } catch (Exception e) {
            throw new IOException("Invalid data from file " +
                    Constants.ROOM_DB_PATH.getClass().getName());
        }
        return room;
    }

    /*
    long id, int numberOfGuests, double price, boolean breakfastIncluded, boolean petsAllowed,
    Date dateAvailableFrom, Hotel hotel
    */
    @Override
    public String toString(Room object) {
        return object.getId() + ", "
                + object.getNumberOfGuests() + ", "
                + object.getPrice() + ", "
                + object.isBreakfastIncluded() + ", "
                + object.isPetsAllowed() + ", "
                + object.getDateAvailableFrom() + ", "
                + object.getHotel().getId();
    }
}