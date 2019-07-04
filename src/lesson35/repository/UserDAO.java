package lesson35.repository;

import lesson35.constants.Constants;
import lesson35.controller.Session;
import lesson35.exceptions.InternalServerException;
import lesson35.model.User;
import lesson35.model.UserType;

public class UserDAO extends GeneralDAO<User> {

    public UserDAO() {
        super(Constants.USER_DB_PATH);
    }

    public User registerUser(User user) throws Exception {
        return super.save(user);
    }

    public static boolean isAdmin() {
        return (Session.getAuthorizedUser() != null &&
                Session.getAuthorizedUser().getUserType() == UserType.ADMIN);
    }

    @Override
    public User mapping(String[] arr) throws InternalServerException {
        User user;

        try {
            long id = Long.parseLong(arr[0]);
            String userName = arr[1];
            String password = arr[2];
            String country = arr[3];

            UserType userType = UserType.valueOf(arr[4]);

            user = new User(id, userName, password, country, userType);

        } catch (Exception e) {
            throw new InternalServerException("Invalid data from file " +
                    Constants.USER_DB_PATH.getClass().getName());
        }
        return user;
    }

    /*
    long id, String userName, String password, String country, UserType userType
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
