package ztm.array;

import java.util.Arrays;

public class FindSubsets {
    //?Pratik Sherdiwala (Codelytics)

    /*
     * Find subsets of array elements
     *
     * array : [1,2]
     *       subsets count = 2^n => 2^array.length => 2^2 => 4 or
     *                     = 1 << array.length
     *       subsets can be => {}, {1,2}, {1}, {2}
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

    //without recursion
    static void allSubsets(int[] array) {

        int totalSubsets = 1 << array.length;

        for (int i = 0; i < totalSubsets; i++) {

            System.out.print("{");

            for (int j = 0; j < array.length; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(array[j]);
                }
            }
            System.out.print("}");
        }
    }

    public static void main(String[] args) {
        findSubsets(new int[]{1, 2});
        System.out.println("----------------");
        //allSubsets(new int[]{1, 2});
    }
}
