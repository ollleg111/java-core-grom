package lesson22.hw2;

import lesson22.hw2.exception.BadRequestException;
import lesson22.hw2.exception.InternalServerException;
import lesson22.hw2.exception.UserNotFoundException;

public class UserRepository {

    private static User[] users = new User[10];

    public static User save(User user) throws Exception {
        if (user == null)
            throw new BadRequestException("Can't save null user");

        try {
            findById(User.getId());
            throw new BadRequestException("User with id: " + user.getId() + " already exist");
        } catch (UserNotFoundException e) {
            System.out.println("User with id: " + user.getId() + "not found. Will be saved");
        }

        int index = 0;
        for (User us : users) {
            if (us == null) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        throw new InternalServerException("Not enough space to save user with id " + user.getId());
    }

    public static User update(User user) throws Exception {
        if (user == null)
            throw new BadRequestException("Can't update null user");

        findById(User.getId());

        int index = 0;
        for (User us : users) {
            if (us != null && us.getId() == user.getId()) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        throw new InternalServerException("Unexpected error");
    }

    public static void delete(long id) throws Exception {

        findById(id);

        int index = 0;
        for (User us : users) {
            if (us.getId() == id) {
                users[index] = null;
                break;
            }
            index++;
        }
    }

    public static User findById(long id) throws UserNotFoundException {
        for (User user : users) {
            if (user != null && id == user.getId())
                return user;
        }
        throw new UserNotFoundException("User with id: " + id + " not found");
    }

    public static User[] getUsers() {
        return users;
    }
}
