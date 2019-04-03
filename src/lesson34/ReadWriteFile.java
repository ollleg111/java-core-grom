package lesson34;

import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args)/* throws InterruptedException*/{
        readFile("/home/owner/Downloads/test1.txt");
        writeFile("/home/owner/Downloads/test1.txt");
    }

    private static void readFile(String path){

//        try (FileReader fileReader = new FileReader(path);
//         BufferedReader bufferedReader = new BufferedReader(fileReader)) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Reading from file " + path + " failed " + e.getMessage());
        }
    }

    private static void writeFile(String path){

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append("\n");
            bufferedWriter.append("kkjbvabvbjkvb");
        } catch (IOException e) {
            System.err.println("Can not write to file " + e.getMessage());
        }
    }
}
