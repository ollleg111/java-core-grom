package lesson35.controller;

import lesson35.model.Hotel;
import lesson35.service.HotelService;

public class HotelController {
    private HotelService hotelService = new HotelService();

    /*
    only for administrators
     */
    public void addHotel(Hotel hotel) throws Exception {
        hotelService.addHotel(hotel);
    }

    /*
    only for administrators
     */
    public void deleteHotel(long hotelId) throws Exception {
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
