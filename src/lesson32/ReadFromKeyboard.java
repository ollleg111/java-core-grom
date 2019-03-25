package lesson32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFromKeyboard {

    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        int count = 2;
//        while (scanner.hasNext()) {
//            System.out.println(scanner.next() + " !");
//            count--;
//
//            if (count == 0) break;
//        }

//        System.out.println("Enter your name: ");
//        System.out.println("Hello, " + scanner.nextLine());
//        scanner.close();

        //readKeyboardWithScanner();
        readKeyboardWithIOStream();

    }

    private static void readKeyboardWithScanner() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        System.out.println("Hello, " + scanner.nextLine());
        scanner.close();

    }

    private static void readKeyboardWithIOStream() throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.println("Enter your name: ");
        System.out.println("Hello, " + bufferedReader.readLine() + " !");

//        try {
//        bufferedReader.readLine();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        //        bufferedReader.readLine();

        bufferedReader.close();
    }
}
