package lesson24.test;

public class Ord extends GeneralDAO<Ord>{

    private long id;
    private String name;

    public Ord(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
