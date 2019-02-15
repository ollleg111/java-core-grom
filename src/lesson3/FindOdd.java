package lesson3;

public class FindOdd {
    public static void main(String[] args) {

        long count = 0;

        for (int i = 0; i <= 1000; i++) {
            if (i % 2 != 0) {

                count += i;
                System.out.println("Found");
            }
        }

        count = count * 5;

        if (count > 5000)
            System.out.println("Bigger");
        else
            System.out.println("Smaller or equal");
    }
}