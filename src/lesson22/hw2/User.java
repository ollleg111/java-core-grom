package lesson22.hw2;

public class User {
    private static long id;
    private static String name;
    private static String sessionId;

    public User(long id, String name, String sessionId) {
        this.id = id;
        this.name = name;
        this.sessionId = sessionId;
    }

    public static long getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static String getSessionId() {
        return sessionId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }
}
