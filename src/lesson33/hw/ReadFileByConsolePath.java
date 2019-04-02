package lesson33.hw;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class ReadFileByConsolePath {

    public static void readFileByConsolePath() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println("Please, enter file path to read: ");

        try {
            String input = bufferedReader.readLine();
            readFile(input);
        } catch (IOException e) {
            //System.err.println("Reading from keyboard failed " + e.getMessage());
            return;
        } finally {
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(bufferedReader);
        }
    }

    private static void readFile(String path) {

        FileReader reader;
        try {
            reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.err.println("File with path " + path + " not found");
            return;
        }

        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Can't read file by path " + path);
        } finally {
            IOUtils.closeQuietly(bufferedReader);
            IOUtils.closeQuietly(reader);
        }
    }
}
