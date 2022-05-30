package ztm.array;

import java.util.Arrays;

public class RotateArrayInKSteps {
    //?Pratik Sherdiwala (Codelytics)
    /*
    * Given an array, rotate the array to the right by k steps,
    * where k is non-negative.
    *
    * Example 1:
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]

    * Example 2:
        Input: nums = [-1,-100,3,99], k = 2
        Output: [3,99,-1,-100]
        Explanation:
        rotate 1 steps to the right: [99,-1,-100,3]
        rotate 2 steps to the right: [3,99,-1,-100]
    * */

    static int[] rotateArray(int[] array, int numberOfRotations) {

        while (numberOfRotations > 0) {
            int[] shiftedArray = new int[array.length];
            int lastElement = array[array.length - 1];

            for (int i = 1; i < array.length; i++) {
                shiftedArray[i] = array[i - 1];
            }
            shiftedArray[0] = lastElement;
            array = shiftedArray;
            numberOfRotations--;
        }

        return array;
    }

    static int[] rotateElementInLeft(int[] array, int numberOfRotation) {
        while (numberOfRotation > 0) {

            int firstElement = array[0];
            int[] shiftedArray = new int[array.length];

            for (int i = 1; i < array.length; i++) {
                shiftedArray[i - 1] = array[i];
            }
            shiftedArray[array.length - 1] = firstElement;
            array = shiftedArray;
            numberOfRotation--;
        }
        return array;
    }

    public static void main(String[] args) {

        System.out.println(
                Arrays.toString(
                        rotateArray(
                                new int[]{1, 2, 3, 4, 5},
                                2
                        )
                )
        );

        System.out.println("------------------------------");

        System.out.println(
                Arrays.toString(
                        rotateElementInLeft(
                                new int[]{1, 2, 3, 4, 5, 6},
                                0
                        )
                )
        );
    }
}
