package ztm.strings;

public class LongestWord {
    //?Pratik Sherdiwala (Codelytics)
    /*
     ! Longest Word
     * Have the function longestWord(sen) take the sen parameter
     * being passed and return the longest word in the string.
     * If there are two or more words that are the same length,
     * return the first word from the string with that length.
     * Ignore punctuation and assume sen will not be empty.
     * Words may also contain numbers, for example "Hello world123 567"

     ? Example 1
        Input: "fun&!! time"
        Output: time

     ? Example 2
        Input: "I love dogs"
        Output: love
     * */

    static String longestWordSolutionTwo(String statement) {
        String longestWord = "";

        //converting the string into array of String
        String[] words = statement
                .replaceAll("[^A-Z^a-z^0-9]", " ")
                .trim()
                .split(" ");

        for (String word : words) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    static String longestWordFromString(String statement) {
        String longestWord = "";

        if (statement == null || statement.isEmpty()) return longestWord;

        int longestIndex = 0;
        String[] words = statement.split("[^A-Z^a-z^0-9]");

        for (String word : words) {
            if (word.length() > longestIndex) {
                longestWord = word;
                longestIndex = word.length();
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        System.out.println(
                longestWordFromString("Hello123 I am Good")
        );

        System.out.println(
                longestWordFromString(
                        "fun&!! time"
                )
        );

        System.out.println(
                longestWordSolutionTwo(
                        "I love dogs"
                )
        );

        System.out.println(
                longestWordFromString(null)
        );
    }
}
