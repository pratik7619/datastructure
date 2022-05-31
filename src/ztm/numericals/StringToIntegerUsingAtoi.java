package ztm.numericals;

public class StringToIntegerUsingAtoi {
    //?Pratik Sherdiwala (Codelytics)

    /*
    * String to Integer using Atoi
    ! Convert a String into 32-bit signed integer
    * */

    static int convertStringIntoInteger(String givenNumberInString) {
        //String givenNumberInString = "  1234+56";
        String[] convertedString = givenNumberInString
                .trim()
                .split(
                        "[-+.^:,0]",
                        0
                );

        int convertedNumber = 0;
        StringBuilder afterConvertingStringNumber = new StringBuilder();

        for (String data : convertedString) {
            afterConvertingStringNumber.append(data);
        }

        for (int i = 0; i < afterConvertingStringNumber.length(); i++) {
            char digit = afterConvertingStringNumber.charAt(i);
            if (Character.isDigit(digit)) {
                convertedNumber = convertedNumber * 10 + Character.getNumericValue(digit);
            }
        }

        if (convertedNumber == 0) return 0;

        if (convertedNumber >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (convertedNumber <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return convertedNumber;
    }

    public static void main(String[] args) {
        System.out.println(
                convertStringIntoInteger("1234+987  9we")
        );
    }
}
