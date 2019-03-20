package lesson31.hw;

import java.util.TreeMap;

import static java.lang.Character.isLetter;

public class Solution {

    public TreeMap<Character, Long> countSymbols(String text) {
        TreeMap<Character, Long> stringMap = new TreeMap<>();

        if (text != null && !text.isEmpty()){

            for (Character character : text.toCharArray()) {

                if (Character.isLetter(character))
                    stringMap.put(character, stringMap.get(character) == null ? 1 : stringMap.get(character) + 1);
            }
        }
        return stringMap;
    }

    public TreeMap<String, Integer> words(String text) {
        TreeMap<String, Integer> stringMap = new TreeMap<>();

        if (text != null && !text.isEmpty()) {
            String[] words = text.trim().split(" ");

            for (String str : words) {

                if (checkWord(str))
                    stringMap.put(str, stringMap.get(str) == null ? 1 : stringMap.get(str) + 1);
            }
        }
        return stringMap;
    }

    private boolean checkWord(String str) {
        boolean checkLetter = false;

        if (str.length() <= 2)
            return checkLetter;

        char[] arr = str.toCharArray();

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
}
