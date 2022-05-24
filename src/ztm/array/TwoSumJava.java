package ztm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumJava {
    //?Pratik Sherdiwala (Codelytics)

    static int[] containsTwoSumWithHashMap(int[] array, int target) {

        Map<Integer, Integer> findValues = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (findValues.containsKey(complement)) {
                return new int[]{findValues.get(complement), i};
            }
            findValues.put(array[i], i);
        }
        return null;
    }

    static int[] containsTwoSum(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println(
                Arrays.toString(containsTwoSum(
                        new int[]{3, 5, 6, 7, 8},
                        200
                ))
        );

        System.out.println(
                Arrays.toString(containsTwoSumWithHashMap(
                        new int[]{-3, 5, 6, 7, 8},
                        2
                ))
        );

        System.out.println(
                Arrays.toString(containsTwoSumWithHashMap(
                        new int[]{-3, 5, 6, 7, 8},
                        13
                ))
        );
    }
}
