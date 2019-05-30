package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.User;

import java.util.ArrayList;

public class UserDAO extends GeneralDAO<User> {

    @Override
    public void setPath(String path) {
        setPath(Constants.USER_DB_PATH);
    }

    @Override
    public User map(String obj) {
        return null;
    }

    @Override
    public String reverseMap(User obj) {
        return null;
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
        //TODO
        return super.isExistObject(user);
    }

    @Override
    public User create(User user) throws Exception {
        //TODO
        return super.create(user);
    }
}
