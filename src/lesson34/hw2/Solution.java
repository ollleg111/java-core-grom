package lesson34.hw2;

import java.io.*;

public class Solution {

    public void transferSentences(String fileFromPath, String fileToPath, String word) throws Exception {

        validate(fileFromPath, fileToPath);
        readFromFile(fileFromPath, word);
//        writeToFile(fileToPath, readFromFile(fileFromPath));
    }

    private StringBuffer readFromFile(String path, String word) {
        StringBuffer res = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                res.append(line);
                res.append("\n");
            }
            String sentence = isSentences(res, word);
            System.out.println(" 3 " + sentence);

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Reading from file " + path + " failed " + e.getMessage());
        }
        return res;
    }

    private String isSentences(StringBuffer resString, String word) {
        String res;
        for (int i = 0; i < resString.length(); i++) {
            if (resString.charAt(i) == '.') {
                for (int j = i + 1; j < resString.length(); j++) {
                    if (resString.charAt(j) == '.') {
                        res = resString.substring(i + 1, j);

                        if (res.contains(word) && res.length() > 10)
                            System.out.println(" 2 " + res);
                        return res;
                    }
                }
            }
        }
        return null;
    }

    private void writeToFile(String path, StringBuffer contentToWrite) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            System.err.println("Can not write to file " + e.getMessage());
        }
    }

//    private void deleteStringFileFrom(String path) {
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, false))) {
//            bufferedWriter.append("");
//
//        } catch (IOException e) {
//            System.out.println("deleting file " + path + " failed");
//        }
//    }

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
