package lesson17;

import static java.lang.Character.isLetter;
import static java.lang.Character.isLetterOrDigit;

public class Solution {
    public static void main(String[] args) {

//        String test = "There is Demo something new or jot sdf sdf sdf word Demo op or";

//        String test = "There";

//        String test = "Dcghd@@ fghj12 test";

        String test = "https://www.gromcode.com";

//        Sys.out.println(Arrays.toString(test.getBytes()));
        System.out.println("   -1-");
        System.out.println(countWords(test));
        System.out.println("   -2-");
        System.out.println(maxWord(test));
        System.out.println("   -3-");
        System.out.println(minWord(test));
        System.out.println("   -4-");
        System.out.println(mostCountedWord(test));
        System.out.println("   -5-");
        System.out.println(validate(test));

    }

    // -1-
//    public static int countWords(String input) {
//        byte[] numbers = input.getBytes();
//
//        int count = 0;
//        for (byte b : numbers) {
//            if (b == 32) {
//                count++;
//            }
//        }
//        return count + 1;
//    }

    // -2-
//    public static int countWords(String input) {
//        int count = 0;
//
//        String[] words = input.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            count++;
//        }
//
//        return count;
//    }

    // -3-
//    public static int countWords(String input) {
//        int count = 0;
//
//        char[] arr = input.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == ' ')
//                count++;
//        }
//        return count + 1;
//    }

    // -4-
//    public static int countWords(String input) {
//        int count = 0;
//
//        char[] arr = input.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == ' ')
//                count++;
//        }
//        return count + 1;
//    }

    // -5-
//    public static int countWords(String input) {
//        int count = 0;
//
//        String[] arr = input.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            if (!arr[i].equals("")) {
//                Sys.out.println(arr[i]);
//                count++;
//            }
//        }
//        return count;
//    }

    public static int countWords(String input) {

        if (input.isEmpty())
            return 0;

        int count = 0;

        String[] arr = input.split(" ");

        for (String testWord : arr) {
            if (checkWord(testWord) == true)
                count++;
        }
        return count;
    }

    private static boolean checkWord(String str) {



        char[] arr = str.toCharArray();
        boolean checkLetter = false;
        for (Character ch : arr) {
            if (isLetter(ch))
                checkLetter = true;
            else {
                checkLetter = false;
                break;
            }
        }
        return checkLetter;
    }

    static String maxWord(String input) {

        if (input.isEmpty())
            return null;

        String[] arrWords = input.split(" ");
        int count = 0;
        int maxCharsInWord = 0;
        //??? long - ?

        for (int i = 0; i < arrWords.length; i++) {

            if (checkWord(arrWords[i])) {

                byte[] charsInWord = arrWords[i].getBytes();
                if (charsInWord.length > maxCharsInWord) {

                    maxCharsInWord = charsInWord.length;
                    count = i;
                }
            }
        }
        if (maxCharsInWord == 0) return null;
        return arrWords[count];
    }

    public static String minWord(String input) {

        if (input.isEmpty())
            return null;

        String[] arrWords = input.split(" ");
        int count = 0;
        int minCharsInWord = 2147483647;

        for (int i = 0; i < arrWords.length; i++) {

            if (checkWord(arrWords[i])) {

                byte[] charsInWord = arrWords[i].getBytes();
                if (charsInWord.length < minCharsInWord) {

                    minCharsInWord = charsInWord.length;
                    count = i;
                }
            }
        }
        if (minCharsInWord == 2147483647) return null;
        return arrWords[count];
    }

    public static String mostCountedWord(String input) {

        if (input.isEmpty())
            return null;

        String[] arrWords = input.split(" ");
        int maxDuplicateWord = 0;
        int wordNumber = -1;

        for (int i = 0; i < arrWords.length; i++) {
            int count = 0;
            if (checkWord(arrWords[i])) {
                for (int j = 0; j < arrWords.length; j++) {
                    if (checkWord(arrWords[j])) {
                        if (arrWords[i].equals(arrWords[j]))
                            count++;
                    }
                }
            }
            if (count > maxDuplicateWord) {
                maxDuplicateWord = count;
                wordNumber = i;
            }
        }
        if (wordNumber < 0) {
            return null;
        }
        return arrWords[wordNumber];
    }

    public static boolean validate(String address) {

        if (address.isEmpty())
            return false;

        if (address == null)
            return false;

        String[] startWordArr = new String[]{"http://", "https://"};
        String[] finishWordArr = new String[]{".com", ".org", ".net"};

        String updateAddress = address.toLowerCase();

        boolean start = false;
        boolean finish = false;

        for (String strStart : startWordArr) {
            if (updateAddress.startsWith(strStart)) {
                start = true;
                updateAddress = updateAddress.replace(strStart, "");
                break;
            }
        }

        for (String strFinish : finishWordArr) {
            if (updateAddress.endsWith(strFinish)) {
                finish = true;
                updateAddress = updateAddress.replace(strFinish, "");
                break;
            }
        }

        String updateTwoWord = updateAddress.replace("www.", "");

        char[] arr = updateTwoWord.toCharArray();
        for (char ch: arr) {
            if (!isLetterOrDigit(ch)) {
                return false;
            }
        }
        return (start && finish);
    }
}
