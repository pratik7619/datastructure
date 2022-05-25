package ztm.hashtable;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {
    //?Pratik Sherdiwala (Codelytics)
    /*
    * Find the length of the largest sub-array with 0 sum
    *
    ? Example
        Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        Output: 5
        Explanation: The longest sub-array with
        elements summing up-to 0 is {-2, 2, -8, 1, 7}
    * */

    //Time Complexity -> O(n)
    static int findMaximumLengthEfficient(int[] array) {
        int maximumLength = 0;
        int sum = 0;

        HashMap<Integer, Integer> sumLengthMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (array[i] == 0 && maximumLength == 0) {
                maximumLength = 1;
            }

            if (sum == 0) {
                maximumLength = i + 1;
            }

            Integer previousI = sumLengthMap.get(sum);

            if (previousI != null)
                maximumLength = Math.max(maximumLength, i - previousI);
            else
                sumLengthMap.put(sum, i);
        }

        return maximumLength;
    }

    //! Brute force solution
    //Time complexity -> O(n^2)
    static int findMaximumLength(int[] array) {

        int maximumLength = 0;

        for (int i = 0; i < array.length; i++) {

            int sum = 0;

            for (int j = i; j < array.length; j++) {
                sum += array[j];

                if (sum == 0) {
                    maximumLength = Math.max(maximumLength, j - i + 1);
                }
            }
        }
        return maximumLength;
    }

    public static void main(String[] args) {

        System.out.println(
                findMaximumLength(
                        new int[]{1, 0, -1, 2, 4, 5, -2, 4}
                )
        );//3

        System.out.println(
                findMaximumLengthEfficient(
                        new int[]{15, -2, 2, -8, 1, 7, 10, 23}
                )
        );//5
    }
}
