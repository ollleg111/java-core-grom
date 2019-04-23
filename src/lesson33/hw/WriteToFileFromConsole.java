package lesson33.hw;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class WriteToFileFromConsole {

    public void writeToFileFromConsole(String path) {

        FileReader fileReader;
        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.err.println("File with path " + path + " not found");
            return;
        }
        System.out.println("Enter file content to write in the file: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.append("\n");

            String str;
            while (!((str = bufferedReader.readLine()).equals("wr"))) {
                bufferedWriter.append(str);
                bufferedWriter.append("\n");
            }

        } catch (IOException e) {
            System.err.println("Can't write to file with path " + path);
        } finally {

            IOUtils.closeQuietly(fileReader);
            IOUtils.closeQuietly(bufferedReader);
            IOUtils.closeQuietly(bufferedWriter);
        }
    }
}
