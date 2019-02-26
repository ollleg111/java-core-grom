package lesson27.hw1;

import java.util.ArrayList;

public class UserRepository {

    private ArrayList<User> users = new ArrayList<>();

    public User save(User user) {
        if (user == null)
            return null;

        if (findById(user.getId()) != null)
            return null;
//
//        int countPlaced = 0;
//        for (User us : users) {
//            if (us != null)
//                countPlaced++;
//        }
//
//        if (countPlaced > 9)
//            return null;

        int index = 0;
        for (User us : users) {
            if (us == null) {
                users.set(index, user);
                break;
            }
            index++;
        }
        return user;
    }

    public User update(User user) {
        if (user == null)
            return null;

        User curUser = findById((user.getId()));
        if (curUser == null)
            return null;

        long curUserId = curUser.getId();

        int index = 0;
        for (User us : users) {
            if (us != null && us.getId() == curUserId) {
                users.set(index, user);
                break;
            }
        }
        return user;
    }

    public void delete(long id) {
        User user = findById(id);

        int index = 0;
        for (User us : users) {
            if (us == user) {
                users.set(index,null);
                break;
            }
            index++;
        }
    }

    private User findById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId())
                return user;
        }
        return null;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    //
//    public User[] getUsers() {
//        return users;
//    }
//
//    public User getFindById(long id) {
//        return findById(id);
//    }
}
