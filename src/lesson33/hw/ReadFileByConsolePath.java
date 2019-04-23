package lesson33.hw;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class ReadFileByConsolePath {

    public static void readFileByConsolePath() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter file path to read: ");

        try {
            String input = bufferedReader.readLine();
            readFile(input);
        }catch (FileNotFoundException e){
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Reading from keyboard failed " + e.getMessage());
            return;
        } finally {
            IOUtils.closeQuietly(bufferedReader);
        }
    }

    private static void readFile(String path) {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File with path " + path + " not found");
            return;
        } catch (IOException e) {
            System.err.println("Can't read file by path " + path);
        } finally {
            IOUtils.closeQuietly(bufferedReader);
        }
    }
}
