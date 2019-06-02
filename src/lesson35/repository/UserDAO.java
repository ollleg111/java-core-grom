package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.User;
import lesson35.model.UserType;

import java.util.ArrayList;

public class UserDAO extends GeneralDAO<User> {

    @Override
    public void setPath(String path) {
        setPath(Constants.USER_DB_PATH);
    }

    @Override
    public ArrayList<User> getAll() {
        return super.getAll();
    }

    @Override
    public User findById(long id) {
        return super.findById(id);
    }

    @Override
    public User find(User user) {
        return super.find(user);
    }

    @Override
    public void remove(User user) throws Exception {
        super.remove(user);
    }

    @Override
    public boolean isExistObject(User user) {
        return super.isExistObject(user);
    }

    @Override
    public User create(User user) throws Exception {
        return super.create(user);
    }

    @Override
    public User mapping(String object) {
        String[] arr = object.split("([,][ ])");
        return new User(Long.parseLong(arr[0]), arr[1], arr[2], arr[3], UserType.valueOf(arr[4]));
    }

    @Override
    public String toFile(User object) {
        return object.getId() + ", " + object.getUserName() + ", " + object.getPassword() + ", "
                + object.getCountry() + ", " + object.getUserType();
        //TODO?????
    }
}
