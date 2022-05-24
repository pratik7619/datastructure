package ztm.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDuplicateElement {
    //?Pratik Sherdiwala (Codelytics)

    /*
    * Given an integer array nums, return true if any value appears at least twice
    * in the array, and return false if every element is distinct.
    *
    * Example 1:
        Input: nums = [1,2,3,1]
        Output: true

    * Example 2:
        Input: nums = [1,2,3,4]
        Output: false

    * Example 3:
        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true
    * */

    //Brute-Force
    /*
    * Time Complexity = O(n^2)
    * */
    static boolean hasCommonElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //Time Complexity => O(n)
    static boolean hasCommonElement2(int[] array) {
        Set<Integer> arrayElement = new HashSet<>();

        for (int num : array) {
            if (arrayElement.contains(num)) {
                return true;
            }
            arrayElement.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(
                hasCommonElement2(
                        new int[]{1, 2, 3, 4, 5, 6, 1}
                )
        );
    }
}
