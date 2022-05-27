package ztm.numericals;

public class PalindromeNumber {
    //?Pratik Sherdiwala (Codelytics)

    static boolean isPalindrome(int num) {

        if (num < 0 || (num % 10 == 0 && num != 0)) return false;

        int reversNumber = 0;
        int originalNumberValue = num;

        while (num != 0) {
            int reminder = num % 10;
            reversNumber = reversNumber * 10 + reminder;
            num = num / 10;
        }

        return originalNumberValue == reversNumber;
    }

    public static void main(String[] args) {

        System.out.println(
                isPalindrome(121)
        );

        System.out.println(
                isPalindrome(566)
        );
    }
}
