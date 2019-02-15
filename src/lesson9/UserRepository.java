package lesson9;

public class UserRepository {

    private User[] users = new User[10];

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        int objectsInArray = 0;
        for (User user : users) {
            if (user != null) {
                objectsInArray++;
            }
        }
        String[] name = new String[objectsInArray];
        int counter = 0;
        for (User user : users) {
            if (user != null) {
                name[counter] = user.getName();
                counter++;
            }
        }
        return name;
    }

//    public long[] getUserIds() {
//
//        int objectsInArray = 0;
//        for (User user : users) {
//            if (user != null) {
//                objectsInArray++;
//            }
//        }
//
//        long[] arr = new long[objectsInArray];
//        int counter = 0;
//        for (User user : users) {
//            if (user != null) {
//                arr[counter] = user.getId();
//                counter++;
//            }
//        }
//        return arr;
//    }

    public long[] getUserIds() {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                count++;
        }
        long[] id = new long[count];
        int counter = 0;
        for (User user : users) {
            if (user != null) {
                id[counter] = user.getId();
                counter++;
            }
        }
        return id;
    }

    public String getUserNameById(long id) {
        for (User user : users) {
            if (user != null && user.getId() == id)
                return user.getName();
        }
        return null;
    }

    /*
    PART 3
     */

    public User getUserByName(String name) {
        for (User user : users) {
            if (user != null && user.getName() == name)
                return user;
        }
        return null;
    }

    public User getUserById(long id) {
        for (User user : users) {
            if (user != null && user.getId() == id)
                return user;
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (User user : users) {
            if (user != null && user.getSessionId() == sessionId)
                return user;
        }
        return null;
    }

    /*
    PART 4
     */

    private User findById(long id) {
        for (User user : users) {
            if (user != null && user.getId() == id)
                return user;
        }
        return null;
    }

    public User save(User user) {

        int counter = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null)
                counter++;
        }

        int nullCounter = 0;
        for (int index = 0; index < users.length; index++) {

            if ((users[index] != null && users[index].getId() == user.getId()) || counter == 0)
                return null;

            if (users[index] == null) {

                if (nullCounter == 0) {
                    users[index] = user;
                } else {
                    users[index] = null;
                }
                nullCounter++;
            }
        }
        return findById(user.getId());
    }

    /*
    PART 5
     */

    public User update(User user) {

        for (int index = 0; index < users.length; index++) {
            if (users[index] != null && users[index].getId() == user.getId()) {
                users[index] = user;
            }
        }
        return findById(user.getId());
    }

    public void delete(long id) {

        for (int index = 0; index < users.length; index++) {
            if (users[index] != null && users[index].getId() == id) {
                users[index] = null;
            }
        }
    }
}