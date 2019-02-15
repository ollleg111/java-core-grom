package lesson8.arithmetic;

public class Arithmetic {

    public boolean check(int[] array) {

        maxValue(array);
        minValue(array);

        long sum = maxValue(array) + minValue(array);

        if (sum > 100) return true;
        else return false;
    }

    private int maxValue(int[] maximum) {
        int max = maximum[0];
        for (int i = 0; i < maximum.length; i++) {
            if (maximum[i] > max) {
                max = maximum[i];
            }
        }
        return max;
    }

    private int minValue(int[] minimum) {
        int min = minimum[0];
        for (int i = 0; i < minimum.length; i++) {
            if (minimum[i] < min) {
                min = minimum[i];
            }
        }
        return min;
    }
}
