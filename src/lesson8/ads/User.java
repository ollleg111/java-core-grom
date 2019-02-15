package lesson8.ads;

public class User extends BaseEntity{

    public String userName;
    public String location;

    public User(long id, String userName, String location) {
        super(id);
        this.userName = userName;
        this.location = location;
    }
}
