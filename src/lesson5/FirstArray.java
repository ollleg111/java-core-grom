package lesson5;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {

        int[] firstArray = new int[4];

        System.out.println(Arrays.toString(firstArray));

        System.out.println("");

        firstArray[0] = 11;
        firstArray[1] = 200;
        firstArray[2] = -10;


        System.out.println(firstArray[0]);
        System.out.println(firstArray[1]);
        System.out.println(firstArray[2]);
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            System.out.println(firstArray[i]);
        }
        System.out.println("");

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }

        System.out.println("");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("");

        int b = 10;
        int[] secondArray = {1, 10, 15, 20, -50};

        System.out.println(Arrays.toString(secondArray));
        System.out.println("");

        for (int element : secondArray) {
            System.out.println(element);
        }
        System.out.println("");

        for (int i = 0; i < firstArray.length; i++) {
            int element = firstArray[i];
            System.out.println(element);
        }
    }
}
