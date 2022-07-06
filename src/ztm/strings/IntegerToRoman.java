package ztm.strings;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    //?Pratik Sherdiwala (Codelytics)

    static String convertIntoRoman(int number) {
        String convertedNumber = "";

        LinkedHashMap<String, Integer> dictionary = new LinkedHashMap<>();
        dictionary.put("M", 1000);
        dictionary.put("CM", 900);
        dictionary.put("D", 500);
        dictionary.put("CD", 400);
        dictionary.put("C", 100);
        dictionary.put("XC", 90);
        dictionary.put("L", 50);
        dictionary.put("XL", 40);
        dictionary.put("X", 10);
        dictionary.put("IX", 9);
        dictionary.put("V", 5);
        dictionary.put("IV", 4);
        dictionary.put("I", 1);

        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            int matches = number / entry.getValue();
            convertedNumber += repeat(entry.getKey(), matches);
            number = number % entry.getValue();
        }

        return convertedNumber;
    }

    /*
     static String repeat(String s, int n) {
        if (s == null) return null;

        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(s);
        }
        return builder.toString();
     }
    * */
    static String repeat(String s, int n) {
        if (s == null || s.isEmpty()) return null;

        return s.repeat(Math.max(0, n));
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(convertIntoRoman(i));
        }
    }
}
