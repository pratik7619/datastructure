package ztm.strings;

public class RegularExpressionMatching {
    //?Pratik Sherdiwala (Codelytics)
    /*
    * Given an input string s and a pattern p,
    *  implement regular expression matching with
    * support for '.' and '*' where:
        '.' Matches any single character.
        '*' Matches zero or more of the preceding element.
        The matching should cover the entire input string (not partial).

    * Example 1:
        Input: s = "aa", p = "a"
        Output: false
        Explanation: "a" does not match the entire string "aa".

    * Example 2 :
        Input: s = "aa", p = "a*"
        Output: true
        Explanation: '*' means zero or more of the preceding element,
        'a'. Therefore, by repeating 'a' once, it becomes "aa".
    * */

    static boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();

        boolean firstMatch = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) ||
                    (firstMatch && isMatch(text.substring(1), pattern)));
        } else {
            return firstMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(
                isMatch(
                        "aa",
                        "a*"
                )
        );
    }
}
