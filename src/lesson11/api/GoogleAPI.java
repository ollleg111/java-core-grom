package lesson11.api;

import java.util.Arrays;

public class GoogleAPI implements API {

    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        int counter = 0;
        for (Room room : getRooms()) {
            if (room.getPrice() == price &&
                    room.getPersons() == persons &&
                    room.getCityName().equals(city) &&
                    room.getHotelName().equals(hotel))
                counter++;
        }

        Room[] searchRooms = new Room[counter];

        int index = 0;
        for (Room room : getRooms()) {
            if (room.getPrice() == price &&
                    room.getPersons() == persons &&
                    room.getCityName().equals(city) &&
                    room.getHotelName().equals(hotel)) {
                searchRooms[index] = room;
                index++;
            }
        }
        System.out.println(3 + " " + Arrays.toString(searchRooms));

        return searchRooms;
    }

    @Override
    public Room[] getAll() {
        int index = 0;
        Room[] allRooms = new Room[rooms.length];
        for (Room room : getRooms()) {
            allRooms[index] = room;
            index++;
        }
        return allRooms;
    }
}
