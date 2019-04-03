package lesson33;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class ReadWriteFile {

    public static void readFile(String path) {
        FileReader reader;
        try {
            reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist " + e.getMessage());
            return;
        }

        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Reading from file " + path + " failed " + e.getMessage());
        } finally {
            IOUtils.closeQuietly(bufferedReader);
            IOUtils.closeQuietly(reader);
        }
    }

    public static void writeFile(String path){

        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
//            TODO use other constructor
//            java.io.File file = new java.io.File("path");
//            writer = new FileWriter(new File(path), true);

            writer = new FileWriter(path, true);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.append("\n");
            bufferedWriter.append("kkjbvabvbjkvbAAAAAAAAAAAA");

        } catch (IOException e) {
            System.err.println("Can not write to file " + e.getMessage());
        } finally {
            IOUtils.closeQuietly(bufferedWriter);
            IOUtils.closeQuietly(writer);
        }
    }
}
