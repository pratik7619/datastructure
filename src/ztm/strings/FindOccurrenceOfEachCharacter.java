package ztm.strings;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfEachCharacter {
    //?Pratik Sherdiwala (Codelytics)
    /*
     * Program to find each character occurrence count in a String
     * Example : AABBBCCC
     *   A : 2
     *   B : 3
     *   C : 3
     * */

    public static void main(String[] args) {

        Map<Character, Integer> characterMap = new HashMap<>();

        String string = "AABBBCCCD";

        for (int i = 0; i < string.length(); i++) {
            char charFromString = string.charAt(i);

            if (characterMap.containsKey(charFromString)) {
                int valueFromKey = characterMap.get(charFromString);
                characterMap.put(charFromString, ++valueFromKey);
            } else {
                characterMap.put(charFromString, 1);
            }
        }

        System.out.println(characterMap);
    }
}
