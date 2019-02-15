package lesson15.hw02;

public class Controller {

    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public API[] getApis() {
        return apis;
    }

    public Room[] requestRooms(int price, int person, String city, String hotel) {

        Room[] result = new Room[3];
        for (API api : getApis()) {
            result = api.findRooms(price, person, city, hotel);
        }
        return result;

//        int counterRooms = 0;
//        for (API api : apis) {
//            if (api.findRooms(price, person, city, hotel) != null) {
//                counterRooms += api.findRooms(price, person, city, hotel).length;
//            }
//        }
//        if (counterRooms == 0) {
//            return null;
//        }
//
//        Room[] result = new Room[counterRooms];
//
//        int counter = 0;
//        for (API api : apis) {
//            if (api.findRooms(price, person, city, hotel) != null) {
//                for (Room room : api.findRooms(price, person, city, hotel)) {
//                    result[counter] = room;
//                    counter++;
//                }
//            }
//        }
//        return result;
    }

    public Room[] check(API api1, API api2) {
        Room[] result;

        int counter = 0;
        int indexLong = 0;
        for (Room roomLong : api1.getAll()) {
            int indexShort = 0;
            for (Room roomShort : api2.getAll()) {
//                if (roomLong.getPrice() == roomShort.getPrice() &&
//                        roomLong.getPersons() == roomShort.getPersons() &&
//                        roomLong.getHotelName().equals(roomShort.getHotelName()) &&
//                        roomLong.getCityName().equals(roomShort.getCityName()))
                if (roomLong.equals(roomShort)) {
                    counter++;
                }
                indexShort++;
            }
            indexLong++;
        }

        result = new Room[counter];

        int index = 0;
        int firstCount = 0;
        for (Room roomLong : api1.getAll()) {
            int secondCount = 0;
            for (Room roomShort : api2.getAll()) {
//                if (roomLong.getPrice() == roomShort.getPrice() &&
//                        roomLong.getPersons() == roomShort.getPersons() &&
//                        roomLong.getHotelName().equals(roomShort.getHotelName()) &&
//                        roomLong.getCityName().equals(roomShort.getCityName()))
                    if (roomLong.equals(roomShort)){
                    result[index] = roomLong;
                    index++;
                }
                secondCount++;
            }
            firstCount++;
        }
        return result;
    }
}
