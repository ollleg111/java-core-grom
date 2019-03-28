package lesson32.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public int readNumbers() throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        //sol 1

//        for (int i = 3; i != 0; i--) {
//            System.out.println("Enter string with 10 numbers: ");
//            int sum = validate(bufferedReader.readLine());
//            int count = i;
//            if (sum != 0) return sum;
//
//            if (--count > 0)
//                System.out.println("Your numbers are wrong. You have " + count + " attempts to try again");
//            else {
//                System.out.println("Your numbers are wrong. Number of attempts exceeded");
//            }
//        }

        //sol 2

        int count = 3;
        while (count != 0) {
            System.out.println("Enter string with 10 numbers: ");
            int sum = validate(bufferedReader.readLine());

            if (sum != 0) return sum;

            System.out.println("Your numbers are wrong. " +
                    (--count > 0 ? "You have " + count + " attempts to try again" :
                            "Number of attempts exceeded"));
        }
        return 0;
    }

    private int validate(String str) {
        int sum = 0;

        String[] numbers = str.trim().split(" ");

        if (numbers.length == 10) {
            for (String number : numbers) {
                if (!checkLetter(number) || Integer.parseInt(number) > 100)
                    return 0;
                else
                    sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    private boolean checkLetter(String str) {
        boolean checkLetter = false;
        char[] arr = str.toCharArray();

        for (Character ch : arr) {
            if (Character.isDigit(ch))
                checkLetter = true;
            else {
                checkLetter = false;
                break;
            }
        }
        return checkLetter;
    }
}
