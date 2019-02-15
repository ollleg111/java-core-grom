package lesson18.exercise1;

import lesson18.exercise1.FileStorage;
import lesson18.exercise1.Storage;

public class Task {

    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage();
        String[] fileNames = {"test1","test2"};
        fileStorage.setFiles(fileNames);

        System.out.println("Start printing name...");

        printer(fileStorage);

        System.out.println("Done");
     }

    public static void printer(Storage storage){
       String [] name = storage.getFiles();

       try {
           System.out.println("5th name is "+ name[4]);
       } catch (Exception e){
           System.err.println("5th name can not be found...");
           //System.err.println(e.getMessage());
       }

       //solution2
    }
}
