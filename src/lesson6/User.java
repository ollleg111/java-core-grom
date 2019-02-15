package lesson6;

import java.util.Date;

public class User {

    public String name;
    public int age;
    public String city;
    public Date lastActiveDate;
    public boolean isActive;

    public User() {
    }

    public User(String name, int age, String city, Date lastActiveDate, boolean isActive) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.lastActiveDate = lastActiveDate;
        this.isActive = isActive;
    }

    public User(String name) {
        this.name = name;
    }

    public void logIn() {
        lastActiveDate = new Date();

    }

    public void isActive(boolean status) {
        isActive = status;
    }

    public void increaseAge() {
        age++;
    }
}
