package lesson34.hw2;

import java.io.*;

public class Solution {

    public void transferSentences(String fileFromPath, String fileToPath, String word) throws Exception {

        validate(fileFromPath, fileToPath);

        StringBuffer stringBufferFrom = readFromFile(fileFromPath);
        StringBuffer stringBufferTo = readFromFile(fileToPath);

        StringBuffer fileFromContent = new StringBuffer();
        StringBuffer fileToContent = new StringBuffer();

        String[] sentences = readFromFile(fileFromPath).toString().split("\\.");

        for (String str : sentences) {
            if (isSentences(str, word)) {
                fileToContent.append(str).append(".");
            } else {
                fileFromContent.append(str).append(".");
            }
        }
        try {
            writeToFile(fileToPath, fileToContent);
            writeToFile(fileFromPath, fileFromContent);
        } catch (Exception e) {
            writeToFile(fileToPath, stringBufferTo);
            writeToFile(fileToPath, stringBufferFrom);
        }
    }

    private StringBuffer readFromFile(String path) {
        StringBuffer res = new StringBuffer();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                res.append(line);
                res.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Reading from file " + path + " failed " + e.getMessage());
        }
        return res;
    }

    private void writeToFile(String path, StringBuffer contentToWrite) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, false))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            System.err.println("Can not write to file " + e.getMessage());
        }
    }

    private boolean isSentences(String sentence, String word) {
        String[] words = sentence.trim().split(" ");

        if (words.length <= 10)
            return false;

        for (String str : words) {
            if (str != null && str.equals(word))
                return true;
        }
        return false;
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
