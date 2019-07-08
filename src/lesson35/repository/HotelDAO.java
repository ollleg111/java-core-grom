package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.Hotel;

import java.io.IOException;

public class HotelDAO extends GeneralDAO<Hotel> {

    public HotelDAO() {
        super("Constants.HOTEL_DB_PATH");
    }

    public void deleteHotel(Hotel hotel) throws Exception {
        super.remove(hotel);
    }

    public Hotel addHotel(Hotel hotel) throws Exception {
        return super.save(hotel);
    }

    @Override
    public Hotel mapping(String[] arr) throws IOException {
        Hotel hotel;

        try {
            long id = Long.parseLong(arr[0]);
            String name = arr[1];
            String country = arr[2];
            String city = arr[3];
            String street = arr[4];
            hotel = new Hotel(id, name, country, city, street);

        } catch (Exception e) {
            throw new IOException("Invalid data from file " +
                    Constants.HOTEL_DB_PATH.getClass().getName());
        }
        return hotel;
    }

    /*
    long id, String name, String country, String city, String street
    */
    @Override
    public String toString(Hotel object) {
        return object.getId() + ", "
                + object.getName() + ", "
                + object.getCountry() + ", "
                + object.getCity() + ", "
                + object.getStreet();
    }
}
