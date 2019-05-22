package lesson35.repository;

import lesson35.constants.Constant;
import lesson35.exceptions.InternalServerException;
import lesson35.model.Filter;
import lesson35.model.Id;
import lesson35.model.Room;

import java.util.ArrayList;
import java.util.Date;

public class RoomDAO extends DAO {

    // найти комнату
    // изменить дату по комнате

    // добавить комнату
    // удалить комнату


    @Override
    String path() {
        return Constant.ROOM_DB_PATH;
    }

    @Override
    Id mapToObject(String[] array) throws InternalServerException {

        throw new InternalServerException("!!!!");
    }

    public ArrayList<Room> find(Filter filter) throws Exception{
        //TODO
        ArrayList<Room> arrayList = new ArrayList<>();
        HotelDAO hotelDAO = new HotelDAO();

        return arrayList;
    }

    public Room add(Room room) throws Exception{
        //TODO
        return null;
    }

    public void delete(long id) throws Exception{
        //TODO

    }

    public void updateDate(Date oldDate, Date newDate, long id) throws InternalServerException{

    }

}