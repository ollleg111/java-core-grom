package lesson35.service;

import lesson35.model.Hotel;
import lesson35.repository.HotelDAO;

public class HotelService {

    private HotelDAO hotelDAO = new HotelDAO();

    public Hotel findHotelByName(String name) throws Exception{
        //TODO
        return hotelDAO.findHotelByName(name);
    }

    public Hotel findHotelByCity(String city) throws Exception{
        //TODO
        return hotelDAO.findHotelByCity(city);
    }

    public Hotel add(Hotel hotel) throws Exception{
        //TODO
        return hotelDAO.add(hotel);
    }

    public Hotel delete(long id) throws Exception{
        //TODO
        return hotelDAO.delete(id);
    }

}