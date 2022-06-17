package ztm.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayTwoMultiplication {
    //?Pratik Sherdiwala (Codelytics)

    static boolean hasMultipliers(int[] array, int target) {

        Set<Integer> values = new HashSet<>();

        for (int num : array) {
            int divisible = target / num;
            if (values.contains(divisible)) {
                return true;
            }
            values.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(
                hasMultipliers(
                        new int[]{3, 4, 5, 6, 7},
                        52
                )
        );

        System.out.println(
                hasMultipliers(
                        new int[]{3, 4, 5, 6, 7},
                        30
                )
        );
    }
}
