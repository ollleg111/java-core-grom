package lesson15.hw02;

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

        Room findRoom = new Room(0, price, persons, null, hotel, city);

        int counter = 0;
        for (Room room : getRooms()) {
            if (room.equals(findRoom))
                counter++;
        }

        Room[] searchRooms = new Room[counter];

        int index = 0;
        for (Room room : getRooms()) {
            if (room.equals(findRoom)) {
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
