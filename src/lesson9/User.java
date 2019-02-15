package lesson9;

public class User {

    public static void main(String[] args) {

//        User[] users = new User[]{
//                new User(20, "A", "a"),
//                new User(21, "B", "ab"),
//                new User(22, "C", "abr"),
//                new User(23, "D", "abra"),
//                new User(24, "E", "abrac"),
//                new User(25, "F", "abraca")
//        };

        User[] users = new User[6];

        users[0] = new User(20, "A", "a");
        users[1] = new User(21, "B", "ab");
        users[2] = new User(24, "D", "abra");
        users[3] = null;
        users[4] = new User(25, "E", "abrac");
        users[5] = null;


        UserRepository userRepository = new UserRepository(users);
//        System.out.println(Arrays.toString(userRepository.getUserNames()));
//        System.out.println(Arrays.toString(userRepository.getUserIds()));
//        System.out.println(userRepository.getUserNameById(23));
//        System.out.println(userRepository.getUserByName("D"));
//        System.out.println(userRepository.getUserById(25));
//        System.out.println(userRepository.getUserBySessionId("abra"));
        System.out.println(userRepository.save(new User(90, "J", "abracadabra")));
//        System.out.println(userRepository.update(new User(25, "EJJJ", "abrJFJGFHac")));
//        userRepository.delete(20);

    }

    private long id;
    private String name;
    private String sessionId;

    public User(long id, String name, String sessionId) {
        this.id = id;
        this.name = name;
        this.sessionId = sessionId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSessionId() {
        return sessionId;
    }
}
