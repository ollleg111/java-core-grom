package lesson32.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public int readNumbers() throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        int sum = 0;

        int count = 3;
        while (count != 0) {
            System.out.println("Enter string with 10 numbers: ");
            String[] numbers = validate(bufferedReader.readLine());
            reader.close();
            bufferedReader.close();

            if (numbers != null) {
                for (String number : numbers) {
                    sum += Integer.parseInt(number);
//                    System.out.println(sum);
                }
                return sum;
            }
            System.out.println("Your numbers are wrong. " +
                    (count-- > 0 ? "You have " + count + " attempts to try again" :
                            "Your numbers are wrong. Number of attempts exceeded"));
        }
        return 0;
    }

    private String[] validate(String str) {

        String[] numbers = str.trim().split(" ");

        if (numbers.length == 10) {
            for (String number : numbers) {
                if (!checkLetter(number) || Integer.parseInt(number) > 100)
                    return null;
            }
        }
        return numbers.length != 10 ? null : numbers;
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
