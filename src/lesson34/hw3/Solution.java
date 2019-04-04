package lesson34.hw3;


import org.apache.commons.io.IOUtils;

import java.io.*;

public class Solution {

    public void copyFileContent(String fileFromPath, String fileToPath) throws Exception {

        validate(fileFromPath, fileToPath);

        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileFrom));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileTo))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Reading from file " + fileFrom + " failed " + e.getMessage());
        }
    }

    public void copyFileContentApacheIO(String fileFromPath, String fileToPath) throws Exception {

        validate(fileFromPath, fileToPath);

        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileFrom));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileTo))) {

            IOUtils.copy(bufferedReader, bufferedWriter);

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Reading from file " + fileFrom + " failed " + e.getMessage());
        }
    }

    private void validate(String fileFromPath, String fileToPath) throws Exception {

        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        if (!fileFrom.exists()) {
            throw new FileNotFoundException("File " + fileFromPath + " does not exist");
        }
        if (!fileTo.exists()) {
            throw new FileNotFoundException("File " + fileToPath + " does not exist");
        }

        if (!fileFrom.canRead()) {
            throw new Exception("File " + fileFrom + " does not have permission to read");
        }

        if (!fileTo.canWrite()) {
            throw new Exception("File " + fileFrom + " does not have permission to write");
        }
    }
}
