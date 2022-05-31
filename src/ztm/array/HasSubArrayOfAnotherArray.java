package ztm.array;

import java.util.HashSet;

public class HasSubArrayOfAnotherArray {
    //?Pratik Sherdiwala (Codelytics)
    /*
    * Given two arrays: arr1[0..m-1] and arr2[0..n-1].
    * Find whether arr2[] is a subset of arr1[] or not.
    * Both the arrays are not in sorted order.
    * It may be assumed that elements in both array are distinct.
    *
    ? Example
        Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
        Output: arr2[] is a subset of arr1[]
    * */

    static boolean isSubArray(int[] mainArray, int[] subArray) {

        if (mainArray.length < subArray.length) return false;

        HashSet<Integer> elements = new HashSet<>();

        for (int value : mainArray) {
            elements.add(value);
        }

        for (int j : subArray) {
            if (!elements.contains(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(
                isSubArray(
                        new int[]{1, 2, 3, 4, 5, 6},
                        new int[]{7, 9}
                )
        );

        System.out.println(
                isSubArray(
                        new int[]{11, 1, 13, 21, 3, 7},
                        new int[]{11, 3, 7}
                )
        );
    }
}
