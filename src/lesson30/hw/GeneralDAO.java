package lesson30.hw;

import java.util.HashSet;
import java.util.Set;

public class GeneralDAO<T> {
    private Set<T> position = new HashSet<>();

    public Set<T> getPosition() {
        return position;
    }

    public T add(T t) {
        position.add(t);
        return t;
    }

    public void remove(T t) {
        position.remove(t);
    }

    public Set<T> getAll() {
        return position;
    }
}
