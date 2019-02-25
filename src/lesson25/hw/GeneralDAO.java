package lesson25.hw;

public class GeneralDAO<T> {

    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[10];

    public T save(T t) throws Exception {

        if (t == null) throw new NullPointerException(" null data ");

        for (T el : array) {
            if (t.equals(el)) {
                throw new Exception("already exist: " + t.toString());
            }
        }

        int index = 0;
        for (T el : array) {
            if (el == null) {
                array[index] = t;
                return array[index];
            }
            index++;
        }
        throw new Exception("error: " + t.toString());
    }

    public T[] getAll() {
        return array;
    }
}
