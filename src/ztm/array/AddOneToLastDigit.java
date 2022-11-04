package ztm.array;
import java.util.Arrays;

public class AddOneToLastDigit {
    //?Pratik Sherdiwala (Codelytics)

    /*
    * Add 1 to array elements
    *
    ? Example 1:
    * Input : 1,0,0
    * Output: 1,0,1
    *
    ? Example 2:
    * Input : 1,9,9
    * Output: 2,0,0
    * */

    static int[] addOneIntoArray(int[] array) {
        int carry = 1;
        int[] afterAddingArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            int sum = array[i] + carry;

            if (sum == 10) {
                carry = 1;
            } else {
                carry = 0;
                afterAddingArray[i] = sum % 10;
            }
        }

        if (carry == 1) {
            afterAddingArray = new int[array.length + 1];
            afterAddingArray[0] = carry;
        }
        return afterAddingArray;
    }

    public static void main(String[] args) {

        System.out.println(
                Arrays.toString(addOneIntoArray(new int[]{1, 2, 0}))
        );

        System.out.println(
                Arrays.toString(addOneIntoArray(new int[]{4, 6, 9}))
        );
    }
}

/*
*    static int[] addOneIntoArrayUsingArrayList(int[] array) {

        StringBuilder convertedArrayIntoString = new StringBuilder();

        for (int num : array) {
            convertedArrayIntoString.append(num);
        }

        System.out.println(convertedArrayIntoString);

        int number = Integer.parseInt(convertedArrayIntoString.toString());

        String formattedNumber = String.valueOf(number + 1);

        System.out.println(formattedNumber);

        int[] newlyCreatedArray = new int[formattedNumber.length()];

        for (int i = 0; i < formattedNumber.length(); i++) {
            newlyCreatedArray[i] = Integer.parseInt(String.valueOf(formattedNumber.charAt(i)));
        }

        System.out.println(Arrays.toString(newlyCreatedArray));
        return newlyCreatedArray;
    }

* */
