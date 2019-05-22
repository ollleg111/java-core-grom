package lesson35.service;

import lesson35.model.Filter;
import lesson35.model.Room;
import lesson35.repository.RoomDAO;

import java.util.ArrayList;

public class RoomService {

   private RoomDAO roomDAO = new RoomDAO();

   public ArrayList<Room> find(Filter filter) throws Exception{
      //TODO
      return roomDAO.find(filter);
   }

   public Room add(Room room) throws Exception{
      //TODO
      return roomDAO.add(room);
   }

   public void delete(long id) throws Exception{
      //TODO
      roomDAO.delete(id);
   }
}
