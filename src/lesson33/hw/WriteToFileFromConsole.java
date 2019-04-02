package lesson33.hw;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class WriteToFileFromConsole {

    public void writeToFileFromConsole(String path) {

        String stopWriting = "wr";
        FileReader fileReader;
        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.err.println("File with path " + path + " not found");
            return;
        }
        System.out.println("Enter file content to write in the file: ");

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;

        try {
            writer = new FileWriter(path, true);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.append("\n");

            String str;
            while (!((str = bufferedReader.readLine()).equals(stopWriting))) {

                bufferedWriter.append(str);
                bufferedWriter.append("\n");
            }

        } catch (IOException e) {
            System.err.println("Can't write to file with path " + path);
        } finally {

            IOUtils.closeQuietly(fileReader);
            IOUtils.closeQuietly(bufferedWriter);
            IOUtils.closeQuietly(writer);
        }
    }
}
