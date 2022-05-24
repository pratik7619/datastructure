package ztm.array;

import java.util.HashMap;
import java.util.Map;

public class MaximumSubArray {
    //?Pratik Sherdiwala (Codelytics)
    /*
     * Given an integer array nums, find the contiguous subarray
     * (containing at least one number) which has the largest
     *  sum and return its sum,
     * */

    static int getLargestSum(int[] array) {
        int maximumSum = array[0];
        int maxEndingPoint = 0;

        //maxEndingPoint = 0/-1/0/-3/0/3/9
        //maximumSum = 3/7/9

        //new int[]{-1,-4, 3, 4, 2, -8}

        for (int j : array) {

            maxEndingPoint = maxEndingPoint + j;

            if (maxEndingPoint < 0) {
                maxEndingPoint = 0;
            } else if (maximumSum < maxEndingPoint) {
                maximumSum = maxEndingPoint;
            }
        }
        return maximumSum;
    }

    public static void main(String[] args) {
        System.out.println(
                getLargestSum(
                        new int[]{-1, -4, 3, 4, 2, -8, 6, 8, 9}
                )
        );

        System.out.println(
                getLargestSum(
                        new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4, 1}
                )
        );
    }
}
