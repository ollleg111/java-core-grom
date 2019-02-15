package lesson4;

public class QuantityExample {
    public static void main(String[] args) {
        System.out.println(findDivCount((short) 0, (short) 99, 2));

    }

    public static int findDivCount(short a, short b, int n) {
        int count = 0;

        if (n > 0 && 0 <= a && a <= b) {


            for (int i = a; i <= b; i++) {

                if (i % n == 0)
                    count++;
            }
        }
        return count;
    }
}
