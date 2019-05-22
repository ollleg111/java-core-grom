package lesson35.repository;

import lesson35.constants.Constant;
import lesson35.exceptions.InternalServerException;
import lesson35.model.Hotel;
import lesson35.model.Id;

public class HotelDAO extends DAO {

    @Override
    String path() {
        return Constant.HOTEL_DB_PATH;
    }

    @Override
    Id mapToObject(String[] array) throws InternalServerException {
        //TODO
        throw new InternalServerException("!!!!");
    }

    public static Hotel findHotelByName(String name) throws Exception {

        //TODO
        return null;
    }

    public Hotel findHotelByCity(String city) throws Exception{
        //TODO
        return null;
    }

    public Hotel add(Hotel hotel) throws Exception{
        //TODO
        return null;
    }

    public void delete(long id) throws Exception{

        //TODO
    }

}
