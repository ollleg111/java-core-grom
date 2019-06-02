package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.Hotel;
import lesson35.model.Room;

import java.util.ArrayList;

public class RoomDAO extends GeneralDAO<Room> {

    @Override
    public void setPath(String path) {
        setPath(Constants.ROOM_DB_PATH);
    }

    @Override
    public ArrayList<Room> getAll() {
        return super.getAll();
    }

    @Override
    public Room findById(long id) {
        return super.findById(id);
    }

    @Override
    public Room find(Room room) {
        return super.find(room);
    }

    @Override
    public void remove(Room room) throws Exception {
        super.remove(room);
    }

    @Override
    public Room create(Room room) throws Exception {
        return super.create(room);
    }

    @Override
    public boolean isExistObject(Room room) {
        return super.isExistObject(room);
    }

    @Override
    public Room mapping(String object) {
        String[] arr = object.split("([,][ ])");

        //TODO

//        return new Room(Integer.parseInt(arr[0]), Double.parseDouble(arr[1]), Boolean.parseBoolean(arr[2]),
//        Boolean.parseBoolean(arr[3]), Date dateAvailableFrom, Hotel hotel);
        return null;
    }

    @Override
    public String toFile(Room object) {
        //TODO
        return null;
    }
}