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

        System.out.println("Enter string with 10 numbers: ");
        String[] numbers = validate(bufferedReader.readLine());
        if (numbers != null) {
            for (String number : numbers) {
                sum += Integer.parseInt(number);

            }

        }

        return sum;
    }

    private String[] validate(String str) {

        String[] numbers = str.trim().split(" ");

        if (numbers.length == 10) {
            for (String number : numbers) {
                if (checkNumber(number) && Integer.parseInt(number) < 100)
                    return null;
            }
        }
        return numbers.length != 10 ? null : numbers;
    }

    private boolean checkNumber(String str) {
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
