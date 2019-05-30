package lesson24.test;

public class Client extends GeneralDAO<Client>{
    private int age;
    private String name;

    public Client(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
