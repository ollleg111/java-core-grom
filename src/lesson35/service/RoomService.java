package lesson35.service;

import lesson35.exceptions.BadRequestException;
import lesson35.model.Filter;
import lesson35.model.Room;
import lesson35.repository.RoomDAO;

import java.util.ArrayList;
import java.util.Date;

public class RoomService {

   private RoomDAO roomDAO = new RoomDAO();

   /*
   only for administrators
    */
   public void addRoom(Room room) throws Exception{
      validate(room);
      roomDAO.create(room);
   }

   /*
   only for administrators
    */
   public void deleteRoom(long roomId) throws Exception{
      roomDAO.remove(roomDAO.findById(roomId));
   }

   public ArrayList<Room> findAll(Filter filter){
      ArrayList <Room> allSearchingRooms = roomDAO.getAll();
      //TODO
      //TODO
      //TODO
      return allSearchingRooms;
   }

   private ArrayList<Room> findByCountry (String country, ArrayList<Room> rooms){
      ArrayList<Room> findRooms = new ArrayList<>();
      //TODO
      return findRooms;
   }

   private ArrayList<Room> findByCity (String city, ArrayList<Room> rooms){
      ArrayList<Room> findRooms = new ArrayList<>();
      //TODO
      return findRooms;
   }

   private ArrayList<Room> findByBreakfast (Boolean isBreakfast, ArrayList<Room> rooms){
      ArrayList<Room> findRooms = new ArrayList<>();
      //TODO
      return findRooms;
   }

   private ArrayList<Room> findByPets (Boolean isPets, ArrayList<Room> rooms){
      ArrayList<Room> findRooms = new ArrayList<>();
      //TODO
      return findRooms;
   }

   private ArrayList<Room> findByPrice (Double price, ArrayList<Room> rooms){
      ArrayList<Room> findRooms = new ArrayList<>();
      //TODO
      return findRooms;
   }

   private ArrayList<Room> findByNumbersOfGuests (Integer numbers, ArrayList<Room> rooms){
      ArrayList<Room> findRooms = new ArrayList<>();
      //TODO
      return findRooms;
   }

   private ArrayList<Room> findByDate (Date date, ArrayList<Room> rooms){
      ArrayList<Room> findRooms = new ArrayList<>();
      //TODO
      return findRooms;
   }

   private void validate(Room room) throws Exception{
      if (room.getHotel() == null)
         throw new BadRequestException("Wrong hotel name");

      if(!room.isPetsAllowed())
         throw new BadRequestException("Pets not allowed");

      if(!room.isBreakfastIncluded())
         throw new BadRequestException("Breakfast not included");

      if(room.getDateAvailableFrom() == null)
         throw new BadRequestException("Wrong enter date")
;   }
}
