package lesson27.hw1;

import java.util.ArrayList;

public class UserRepository {

    ArrayList<User> users = new ArrayList<>();

    public User findById(long id) throws Exception {

        int count = 0;
        for (User user : users) {
            if (user == null) throw new NullPointerException("null!!!!");

            if (id == user.getId()) {
                return users.get(count);
            }
            count++;
        }
        return null;
    }

    public User save(User user) throws Exception {

        if (user == null) throw new NullPointerException("null!!!!");

        if (findById(user.getId()) != null)
            throw new Exception(" user already exist");

        users.add(user);
        return user;
    }

    public User update(User user) throws Exception {
        if (user == null) throw new NullPointerException("null!!!!");


        if (findById(user.getId()) == null)
            throw new Exception(" user with ID: " + user.getId() + " can not be found");

        users.set((int) user.getId(), user);

        return user;
    }

    public void delete(long id) throws Exception {
        if (findById(id) == null) throw new Exception(" user with ID: " + id + " can not be found");

        users.remove(id);
    }
}
