package ztm.array;

import java.util.Arrays;

public class FindSubsets {
    //?Pratik Sherdiwala (Codelytics)

    /*
     * Find subsets of array elements
     *
     * array : [1,2]
     *       subsets count = 2^n => 2^array.length => 2^2 => 4
     *       sebsets can be => {}, {1,2}, {1}, {2}
     * */

    static void getSubset(int[] givenArray, Integer[] subset, int index) {
        if (index == givenArray.length) {
            System.out.println(Arrays.toString(subset));
        } else {
            subset[index] = null;
            getSubset(givenArray, subset, index + 1);
            subset[index] = givenArray[index];
            getSubset(givenArray, subset, index + 1);
        }
    }

    static void findSubsets(int[] array) {
        Integer[] subset = new Integer[array.length];
        getSubset(array, subset, 0);
    }

    public static void main(String[] args) {
        findSubsets(new int[]{1, 2});
    }
}
