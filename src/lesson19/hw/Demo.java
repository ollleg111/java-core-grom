package lesson19.hw;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        String[] formatSupportedStorage = new String[]{"doc", "txt"};

        File[] files1 = new File[5];
        File[] files2 = new File[5];

        Controller controller = new Controller();

        Storage storage1 = new Storage(123, files1, formatSupportedStorage, "Ukraine", 3072);
        Storage storage2 = new Storage(789, files2, formatSupportedStorage, "Ukraine", 3072);

            File file1 = new File(11, "file1", "doc", 512);
            File file2 = new File(12, "file2", "doc", 512);
            File file3 = new File(13, "file3", "xls", 512);
            File file4 = new File(14, "file4", "jpg", 512);
            File file5 = new File(15, "file5", "doc", 512);
            File file6 = new File(16, "file6", "doc", 512);
            File file7 = new File(17, "file7", "doc", 512);
            File file8 = new File(18, "file8", "doc", 512);

        try {
            controller.put(storage1, null);
        } catch (Exception e) {
            System.out.println("-null- " + e.getMessage());
        }

        try {
            controller.put(storage1, file1);
        } catch (Exception e) {
            System.out.println("-1- " + e.getMessage());
        }

        try {
            controller.put(storage1, file2);
        } catch (Exception e) {
            System.out.println("-2- " + e.getMessage());
        }

        try {
            controller.put(storage1, file3);
        } catch (Exception e) {
            System.out.println("-3- " + e.getMessage());
        }

        try {
            controller.put(storage1, file4);
        } catch (Exception e) {
            System.out.println("-4- " + e.getMessage());
        }

        try {
            controller.put(storage1, file5);
        } catch (Exception e) {
            System.out.println("-5- " + e.getMessage());
        }

        try {
            controller.put(storage1, file8);
        } catch (Exception e) {
            System.out.println("-8- " + e.getMessage());
        }

        try {
            controller.put(storage1, file8);
        } catch (Exception e) {
            System.out.println("-9- " + e.getMessage());
        }

        try {
            controller.put(storage1, file7);
        } catch (Exception e) {
            System.out.println("-10- " + e.getMessage());
        }

        System.out.println(Arrays.toString(storage1.getFiles()));

        try {
            controller.delete(storage1, file5);
        } catch (Exception e) {
            System.out.println("-delete1- " + e.getMessage());
        }
        System.out.println(Arrays.toString(storage1.getFiles()));

        try {
            controller.delete(storage1, file2);
        } catch (Exception e) {
            System.out.println("-delete2- " + e.getMessage());
        }
        System.out.println(Arrays.toString(storage1.getFiles()));
        System.out.println("----------------------");

        try {
            controller.transferAll(storage1, storage2);
        } catch (Exception e) {
            System.out.println("-transferAll- " + e.getMessage());
        }
        System.out.println(Arrays.toString(storage2.getFiles()));

//        try {
//            controller.transferFile(storage1, storage2, 15);
//        } catch (Exception e) {
//            System.out.println("-transferFile- " + e.getMessage());
//        }
//        System.out.println(Arrays.toString(storage2.getFiles()));
    }

}
