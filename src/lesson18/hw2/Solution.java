package lesson18.hw2;

import java.util.Arrays;
import static java.lang.Character.isDigit;

public class Solution {
    public static void main(String[] args) {

        String str = "aaa bbbb cc2cc 2.1 344 fff56 1";

        System.out.println(Arrays.toString(findNumbers(str)));
    }

    public static int[] findNumbers(String text) {

        if (text.isEmpty())
            return null;

        int count = 0;

        String[] arrStr = text.split(" ");

        for (String testWord : arrStr) {
            if(checkWord(testWord)){
                count++;
            }
            else {
                System.out.println("not a number");
            }
        }

        int[] number = new int[count];

        int counter = 0;
        for (String testWord : arrStr) {
            if (checkWord(testWord)) {
                number[counter] = Integer.parseInt(testWord);
                counter++;
            }
        } 
        return number;
    }

    private static boolean checkWord(String str) {

        char[] arr = str.toCharArray();
        boolean checkLetter = false;
        for (Character ch : arr) {
            if (isDigit(ch))
                checkLetter = true;
            else {
                checkLetter = false;
                break;
            }
        }
        return checkLetter;
    }
}
