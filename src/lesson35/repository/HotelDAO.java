package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.Hotel;

import java.util.ArrayList;

public class HotelDAO extends GeneralDAO<Hotel> {

    public HotelDAO() {
        setPath(Constants.HOTEL_DB_PATH);
    }

    @Override
    public void setPath(String path) {
        super.setPath(path);
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
    public Hotel create(Hotel hotel) throws Exception {
        return super.create(hotel);
    }

    @Override
    public Hotel map(String obj) {
        //TODO
        return null;
    }

    @Override
    public String reverseMap(Hotel obj) {
        //TODO
        return null;
    }
}
