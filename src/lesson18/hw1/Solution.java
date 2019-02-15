package lesson18.hw1;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String str = "aaa bbbb cc2cc 2.1 344 fff56 1";

        System.out.println(Arrays.toString(findNumbers(str)));
    }

    public static int[] findNumbers(String text) {

        if (text.isEmpty())
            return null;

        String[] arrStr = text.split(" ");

        int counter = 0;
        for (String str : arrStr) {

            try {
                Integer.parseInt(str);
                counter++;

            } catch (Exception e) {
                System.out.println("not a number");
            }
        }

        int[] number = new int[counter];

        int count = 0;
        for (String str : arrStr) {

            try {
                int a = Integer.parseInt(str);
                number[count] = a;
                count++;

            } catch (Exception e) {

            }
        }
        return number;
    }
}
