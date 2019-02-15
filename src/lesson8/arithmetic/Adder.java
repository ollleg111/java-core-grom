package lesson8.arithmetic;

public class Adder extends Arithmetic {

    public long add(int a, int b) {
        return (long) a + (long) b;
    }

    @Override
    public boolean check(int[] array) {
        return super.check(array);
    }
}
