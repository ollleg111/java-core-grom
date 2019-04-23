package lesson34.hw2;

import java.io.*;

public class Solution {

    public void transferSentences(String fileFromPath, String fileToPath, String word) throws Exception {

        validate(fileFromPath, fileToPath);

        String fileContent = readFromFile(fileFromPath).toString();

        String[] sentences = fileContent.split(".");

        try {

            StringBuffer sentencesWithWord = new StringBuffer();
            StringBuffer stringBuffer = new StringBuffer();

            for (String sentence : sentences) {

                if (sentence.contains(word) && sentence.length() > 10) {
                    sentencesWithWord.append(sentence).append(".");
                    fileContent = fileContent.replace(sentencesWithWord + ".", "");
                    stringBuffer.append(fileContent);
                }
            }
            writeToFiles(fileFromPath, stringBuffer);
            writeToFiles(fileToPath, sentencesWithWord);

        } catch (Exception e) {
            System.out.println("Write to file failure");
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
            res.replace(res.length() - 1, res.length(), "");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Reading from file " + path + " failed " + e.getMessage());
        }
        return res;
    }

    private void writeToFiles(String path, StringBuffer contentToWrite) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, false))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            System.err.println("Can not write to file " + e.getMessage());
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