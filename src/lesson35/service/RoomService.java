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
    public void addRoom(Room room) throws Exception {
        validate(room);
        roomDAO.create(room);
    }

    /*
    only for administrators
     */
    public void deleteRoom(long roomId) throws Exception {
        roomDAO.remove(roomDAO.findById(roomId));
    }

    public ArrayList<Room> findFromFilter(Filter filter) {
        /*
        ArrayList<Room> allSearchingRooms = roomDAO.getAll();
        ArrayList<Room> findByNumbersOfGuests = findByNumbersOfGuests(filter.getNumberOfGuests(), allSearchingRooms);
        ArrayList<Room> findByPrice = findByPrice(filter.getPrice(),findByNumbersOfGuests);
        ArrayList<Room> findByBreakfast = findByBreakfast(filter.isBreakfastIncluded(),findByPrice);
        ArrayList<Room> findByPets = findByPets(filter.isPetsAllowed(),findByBreakfast);
        ArrayList<Room> findByDate = findByDate(filter.getDateAvailableFrom(),findByPets);
        ArrayList<Room> findByCountry = findByCountry(filter.getCountry(),findByDate);
        ArrayList<Room> findByCity = findByCity(filter.getCity(),findByCountry);
        return findByCity;
        */
        return findByCity(filter.getCity(),
                findByCountry(filter.getCountry(),
                        findByDate(filter.getDateAvailableFrom(),
                                findByPets(filter.isPetsAllowed(),
                                        findByBreakfast(filter.isBreakfastIncluded(),
                                                findByPrice(filter.getPrice(),
                                                        findByNumbersOfGuests(filter.getNumberOfGuests(),
                                                                roomDAO.getAll())))))));
    }

    private ArrayList<Room> findByNumbersOfGuests(Integer numbers, ArrayList<Room> arrayList) {
        ArrayList<Room> findRooms = new ArrayList<>();
        if (numbers == null)
            return arrayList;
        for (Room room : arrayList) {
            if (room.getNumberOfGuests() == numbers)
                findRooms.add(room);
        }
        return findRooms;
    }

    private ArrayList<Room> findByPrice(Double price, ArrayList<Room> arrayList) {
        ArrayList<Room> findRooms = new ArrayList<>();
        if (price == null)
            return arrayList;
        for (Room room : arrayList) {
            if (room.getPrice() <= price)
                findRooms.add(room);
        }
        return findRooms;
    }

    private ArrayList<Room> findByBreakfast(Boolean isBreakfast, ArrayList<Room> arrayList) {
        ArrayList<Room> findRooms = new ArrayList<>();
        if (isBreakfast == null)
            return arrayList;
        for (Room room : arrayList) {
            if (room.isBreakfastIncluded() == isBreakfast)
                findRooms.add(room);
        }
        return findRooms;
    }

    private ArrayList<Room> findByPets(Boolean isPets, ArrayList<Room> arrayList) {
        ArrayList<Room> findRooms = new ArrayList<>();
        if (isPets == null)
            return arrayList;
        for (Room room : arrayList) {
            if (room.isPetsAllowed() == isPets)
                findRooms.add(room);
        }
        return findRooms;
    }

    private ArrayList<Room> findByDate(Date date, ArrayList<Room> arrayList) {
        ArrayList<Room> findRooms = new ArrayList<>();
        if (date == null)
            return arrayList;
        for (Room room : arrayList) {
            if (room.getDateAvailableFrom() == date)
                findRooms.add(room);
        }
        return findRooms;
    }

    private ArrayList<Room> findByCountry(String country, ArrayList<Room> arrayList) {
        ArrayList<Room> findRooms = new ArrayList<>();
        if (country == null)
            return arrayList;
        for (Room room : arrayList) {
            if (room.getHotel().getCountry().equals(country))
                findRooms.add(room);
        }
        return findRooms;
    }

    private ArrayList<Room> findByCity(String city, ArrayList<Room> arrayList) {
        ArrayList<Room> findRooms = new ArrayList<>();
        if (city == null)
            return arrayList;
        for (Room room : arrayList) {
            if (room.getHotel().getCity().equals(city))
                findRooms.add(room);
        }
        return findRooms;
    }

    private void validate(Room room) throws Exception {
        if (room.getHotel() == null)
            throw new BadRequestException("Wrong hotel name");

        if (!room.isPetsAllowed())
            throw new BadRequestException("Pets not allowed");

        if (!room.isBreakfastIncluded())
            throw new BadRequestException("Breakfast not included");

        if (room.getDateAvailableFrom() == null)
            throw new BadRequestException("Wrong enter date");
    }
}
