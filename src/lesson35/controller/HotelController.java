package lesson35.controller;

import lesson35.model.Hotel;
import lesson35.repository.UserDAO;
import lesson35.service.HotelService;

import java.nio.file.AccessDeniedException;

public class HotelController {
    private HotelService hotelService = new HotelService();

    /*
    only for administrators
     */
    public void addHotel(Hotel hotel) throws Exception {
        if (!UserDAO.isAdmin())
            throw new AccessDeniedException("User do not have permission");
        hotelService.addHotel(hotel);
    }

    /*
    only for administrators
     */
    public void deleteHotel(long hotelId) throws Exception {
        if (!UserDAO.isAdmin())
            throw new AccessDeniedException("User do not have permission");
        hotelService.deleteHotel(hotelId);
    }

    /*
    for users
     */
    public Hotel findHotelByName(String name) throws Exception {
        return hotelService.findHotelByName(name);
    }

    /*
    for users
     */
    public Hotel findHotelByCity(String city) throws Exception {
        return hotelService.findHotelByCity(city);
    }
}
