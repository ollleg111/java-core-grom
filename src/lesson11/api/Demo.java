package lesson11.api;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {

//        Room room0 = new Room(1, 100, 2, new Date(), "Corona", "Kiev");
//        Room room1 = new Room(2, 100, 2, new Date(), "Corona", "Kiev");
//        Room room2 = new Room(3, 200, 2, new Date(), "Corona", "Kiev");
//        Room room3 = new Room(4, 100, 2, new Date(), "Corona", "Kiev");
//        Room room4 = new Room(5, 60, 2, new Date(), "Corona", "Kiev");
//        Room room5 = new Room(6, 700, 2, new Date(), "Corona", "Kiev");
//        Room room6 = new Room(7, 800, 2, new Date(), "Corona", "Kiev");
//        Room room7 = new Room(8, 350, 2, new Date(), "Corona", "Kiev");

        Room room0 = new Room(1, 100, 2, new Date(), "Corona", "Kiev");
        Room room1 = new Room(2, 200, 2, new Date(), "Corona", "Kiev");
        Room room2 = new Room(3, 300, 2, new Date(), "Corona", "Kiev");
        Room room3 = new Room(4, 400, 2, new Date(), "Corona", "Kiev");
        Room room4 = new Room(5, 100, 2, new Date(), "Corona", "Kiev");
        Room room5 = new Room(6, 500, 2, new Date(), "Corona", "Kiev");
        Room room6 = new Room(7, 600, 2, new Date(), "Corona", "Kiev");
        Room room7 = new Room(8, 200, 2, new Date(), "Corona", "Kiev");

        Room[] rooms = new Room[]{room0, room1, room2, room3, room4, room5, room6, room7};

//        API bookingAPI = new BookingComAPI(rooms);
//        API tripAdvisorAPI = new TripAdvisorAPI(rooms);
//        API googleAPI = new GoogleAPI(rooms);
//
//        API[] apis = new API[]{bookingAPI, tripAdvisorAPI, googleAPI};

        API[] apis = new API[]{new BookingComAPI(rooms), new TripAdvisorAPI(rooms), new GoogleAPI(rooms)};
        Controller controller = new Controller(apis);

        Room room00 = new Room(1, 200, 1, new Date(), "a", "q");
        Room room01 = new Room(2, 100, 2, new Date(), "b", "w");
        Room room02 = new Room(3, 20, 3, new Date(), "c", "e");
        Room room03 = new Room(4, 10, 2, new Date(), "d", "r");

        System.out.println("test     1");
        Room[] roomsGoogle0 = new Room[]{room00, room01};
        Room[] roomsBooking0 = new Room[]{room02, room03};
        controller.check(new GoogleAPI(roomsGoogle0), new BookingComAPI(roomsBooking0));

        Room room04 = new Room(5, 200, 1, new Date(), "Corona", "a");
        Room room05 = new Room(6, 200, 2, new Date(), "a", "b");
        Room room06 = new Room(7, 200, 3, new Date(), "Corona", "c");
        Room room07 = new Room(8, 200, 4, new Date(), "b", "d");

        System.out.println("test     2");
        Room[] roomsGoogle1 = new Room[]{room04, room05};
        Room[] roomsBooking1 = new Room[]{room06, room07};
        controller.check(new GoogleAPI(roomsGoogle1), new BookingComAPI(roomsBooking1));

        Room room08 = new Room(9, 200, 1, new Date(), "z", "a");
        Room room09 = new Room(10, 200, 2, new Date(), "a", "b");
        Room room10 = new Room(11, 1, 3, new Date(), "x", "c");
        Room room11 = new Room(12, 20, 4, new Date(), "b", "d");

        System.out.println("test     3");
        Room[] roomsGoogle2 = new Room[]{room08, room09};
        Room[] roomsBooking2= new Room[]{room10, room11};
        controller.check(new GoogleAPI(roomsGoogle2), new BookingComAPI(roomsBooking2));

        Room room12 = new Room(13, 200, 1, new Date(), "z", "a");
        Room room13 = new Room(14, 200, 2, new Date(), "a", "b");
        Room room14 = new Room(15, 1, 3, new Date(), "x", "b");
        Room room15 = new Room(16, 20, 4, new Date(), "b", "d");

        System.out.println("test     4");
        Room[] roomsGoogle3 = new Room[]{room12, room13};
        Room[] roomsBooking3= new Room[]{room14, room15};
        controller.check(new GoogleAPI(roomsGoogle3), new BookingComAPI(roomsBooking3));

        System.out.println("test     5");

        Room room000 = new Room(1, 100, 2, new Date(), "a", "a");
        Room room001 = new Room(2, 100, 3, new Date(), "b", "b");
        Room room002 = new Room(3, 300, 4, new Date(), "c", "c");

        Room[] rooms001 = new Room[]{room000, room001, room002};

        API[] apis001 = new API[]{new BookingComAPI(rooms001), new TripAdvisorAPI(rooms001), new GoogleAPI(rooms001)};
        Controller controller001 = new Controller(apis001);
        controller001.requestRooms(100, 5,"d", "d");
        System.out.println("test     6");
        controller001.requestRooms(500, 2,"z", "z");
        System.out.println("test     7");
        controller001.requestRooms(500, 5,"a", "z");
        System.out.println("test     8");
        controller001.requestRooms(500, 5,"z", "a");
        System.out.println("test     9");
        controller001.requestRooms(100, 2,"a", "a");
        System.out.println("test     10");

//        System.out.println(Arrays.toString(controller.requestRooms(100, 2,"Kiev", "Corona")));
//        controller.check(new GoogleAPI(rooms),new TripAdvisorAPI(rooms));
//        System.out.println(" ");
//        API bookingAPI = new BookingComAPI(rooms);
//        System.out.println(Arrays.toString(bookingAPI.getAll()));
//        System.out.println(" ");
//        API tripAdvisorAPI = new TripAdvisorAPI(rooms);
//        System.out.println(Arrays.toString(tripAdvisorAPI.getAll()));
//        System.out.println(" ");
//        API googleAPI = new GoogleAPI(rooms);
//        System.out.println(Arrays.toString(googleAPI.getAll()));
    }
}
