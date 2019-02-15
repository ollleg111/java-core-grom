package lesson15.hw01;

public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public User save(User user) {
        if (user == null)
            return null;

        if (findUser(user) != null)
            return null;

        int index = 0;
        for (User us : users) {
            if (us == null) {
                users[index] = user;
                break;
            }
            index++;
        }
        return findUser(user);
    }

    public User update(User user) {
        if (user == null)
            return null;

        int index = 0;
        for (User us : users) {
            if (users[index] != null && us != null && us.getId() == user.getId()) {
                users[index] = user;
                break;
            }
        }
        return findUser(user);
    }

    public void delete(long id) {
        int index = 0;
        for (User us : users) {
//            if (users[index] != null && us != null && (long) us.hashCode() == id) {
            if (users[index] != null && us != null && us.getId() == id) {
                users[index] = null;
                break;
            }
            index++;
        }
    }

    public User findUser(User user) {
        if (user == null)
            return null;

        for (User us : users) {
            if (user.equals(us))
                return user;
        }
        return null;
    }
}
