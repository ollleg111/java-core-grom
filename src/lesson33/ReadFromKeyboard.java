package lesson33;

import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromKeyboard {

    public static void main(String[] args) throws IOException {

        readKeyboardWithIOStream1();
        readKeyboardWithIOStream2();

    }

    private static void readKeyboardWithIOStream1() {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            System.out.println("Enter your name: ");
            System.out.println("Hello, " + bufferedReader.readLine() + " !");
        } catch (IOException e) {
            System.err.println("Reading from keyboard failed " + e.getMessage());
        } finally {
            try {
                reader.close();
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Closing stream failed " + e.getMessage());
            }
        }
    }

    private static void readKeyboardWithIOStream2() {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            System.out.println("Enter your name: ");
            System.out.println("Hello, " + bufferedReader.readLine() + " !");
        } catch (IOException e) {
            System.err.println("Reading from keyboard failed " + e.getMessage());
        } finally {
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(bufferedReader);
        }
    }
}
