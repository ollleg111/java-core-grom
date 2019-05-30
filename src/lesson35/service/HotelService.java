package lesson35.service;

import lesson35.exceptions.BadRequestException;
import lesson35.model.Hotel;
import lesson35.repository.HotelDAO;

public class HotelService {

    private HotelDAO hotelDAO = new HotelDAO();

    /*
    only for administrators
     */
    public void addHotel(Hotel hotel) throws Exception {
        validate(hotel);
        hotelDAO.create(hotel);
    }

    /*
    only for administrators
     */
    public void deleteHotel(long hotelId) throws Exception {
        hotelDAO.remove(hotelDAO.findById(hotelId));
    }

    /*
    for users
     */
    public Hotel findHoteByName(String name) throws Exception {
        for (Hotel hotel : hotelDAO.getAll()) {
            if (hotel.getName().equals(name))
                return hotel;
        }
        throw new BadRequestException("Hotel with name: " + name + " does not exist");
    }

    /*
    for users
     */
    public Hotel findHotelByCity(String city) throws Exception {
        for (Hotel hotel : hotelDAO.getAll()) {
            if (hotel.getCity().equals(city))
                return hotel;
        }
        throw new BadRequestException("Hotel in city: " + city + " does not exist");
    }


    private void validate(Hotel hotel) throws BadRequestException {
        if (hotel.getName() == null)
            throw new BadRequestException("Wrong hotel name");

        if (hotel.getCity() == null)
            throw new BadRequestException("Wrong city");

        if (hotel.getCountry() == null)
            throw new BadRequestException("Wrong country");

        if (hotel.getStreet() == null)
            throw new BadRequestException("Wrong street");
    }

}