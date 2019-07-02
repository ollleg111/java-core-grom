package lesson35.repository;

import lesson35.model.Hotel;

import java.util.ArrayList;

public class HotelDAO extends GeneralDAO<Hotel> {

    public HotelDAO() {
        super("Constants.HOTEL_DB_PATH");
    }

    @Override
    public boolean isExistObject(Hotel hotel) {
        return super.isExistObject(hotel);
    }

    @Override
    public ArrayList<Hotel> getAll() {
        return super.getAll();
    }

    @Override
    public Hotel findById(long id) {
        return super.findById(id);
    }

    @Override
    public Hotel find(Hotel hotel) {
        return super.find(hotel);
    }

    @Override
    public void remove(Hotel hotel) throws Exception {
        super.remove(hotel);
    }

    @Override
    public Hotel save(Hotel hotel) throws Exception {
        return super.save(hotel);
    }

    @Override
    public Hotel mapping(String object) {
        String[] arr = object.split("([,][ ])");

        long id = Long.parseLong(arr[0]);
        String name = arr[1];
        String country = arr[2];
        String city = arr[3];
        String street = arr[4];

        return new Hotel(id, name, country, city, street);
    }

    /*
    public Hotel(long id, String name, String country, String city, String street) {
    */
    @Override
    public String toFile(Hotel object) {
        return object.getId() + ", "
                + object.getName() + ", "
                + object.getCountry() + ", "
                + object.getCity() + ", "
                + object.getStreet();
    }
}
