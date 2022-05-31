package ztm.numericals;

public class ReverseInteger {
    //?Pratik Sherdiwala (Codelytics)
    /*
    * Reverse integer
    *
    * Example :
        Input : 123
        Output : 321

    * Example :
        Input : -432
        Output : -234
    * */

    //! Brute force
    static int reverseInteger(int num) {

        int reverseNumber = 0;
        boolean isNegative = false;

        if (num == 0) return 0;

        if (num < 0) {
            isNegative = true;
            num = Math.abs(num);
        }

        while (num != 0) {
            int reminder = num % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            num /= 10;
        }

        return (isNegative) ? -reverseNumber : reverseNumber;
    }

    public static void main(String[] args) {

        System.out.println(
                reverseInteger(123)
        );

        System.out.println(
                reverseInteger(-678)
        );
    }
}
