package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.model.User;
import lesson35.model.UserType;

public class UserDAO extends GeneralDAO<User> {

    public UserDAO() {
        super(Constants.USER_DB_PATH);
    }

    /*
    метод registerUser находится UserService
     */

    @Override
    public User mapping(String object) {
        String[] arr = object.split("([,][ ])");

        long id = Long.parseLong(arr[0]);
        String userName = arr[1];
        String password = arr[2];
        String country = arr[3];

        UserType userType = UserType.valueOf(arr[4]);

        return new User(id, userName, password, country, userType);
    }

    /*
    public User(long id, String userName, String password, String country, UserType userType) {
    */
    @Override
    public String toFile(User object) {
        return object.getId() + ", "
                + object.getUserName() + ", "
                + object.getPassword() + ", "
                + object.getCountry() + ", "
                + object.getUserType();
    }
}
