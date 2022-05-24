package ztm.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZerosToEnd {
    //?Pratik Sherdiwala (Codelytics)

    /*
    * Given an integer array nums, move all 0's to
    * the end of it while maintaining the relative order
    *  of the non-zero elements.
    ! Note that you must do this in-place without making a copy of the array.
    *
    * Example 1:
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]

    * * Example 2:
        Input: nums = [0]
        Output: [0]
    * */

    static Integer[] moveAllZerosToEnd(int[] array) {
        ArrayList<Integer> convertedArray = new ArrayList<>();

        int totalZeros = 0;

        for(int num : array) {
            if (num == 0) {
                totalZeros++;
            } else {
                convertedArray.add(num);
            }
        }

        while (totalZeros > 0) {
            totalZeros--;
            convertedArray.add(0);
        }

        return convertedArray.toArray(new Integer[0]);
    }

    static int[] moveZerosToEnd(int[] array) {

        int lastFoundZeroAtIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[lastFoundZeroAtIndex++] = array[i];
            }
        }
        for (int i = lastFoundZeroAtIndex; i < array.length ; i++) {
            array[i] = 0;
        }
        return array;
    }

    public static void main(String[] args) {

        System.out.println(
                Arrays.toString(
                        moveAllZerosToEnd(
                                new int[]{1, 4, 0, 6, 8, 0, 6, 7, 0, 0}
                        )
                )
        );

        System.out.println("---------------------------------------");
        System.out.println(
                Arrays.toString(
                        moveZerosToEnd(
                                new int[]{1, 4, 0, 6, 8, 0, 6, 7, 0, 0}
                        )
                )
        );
    }
}
