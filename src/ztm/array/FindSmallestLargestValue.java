package ztm.array;

import java.util.Arrays;

/*
 * Find smallest and largest element value from an array without
 * sorting operation
 *
 * Ex : [10, 50, 5, 80, 90, 20, 15]
 * Smallest : 5
 * Largest : 90
 * */
public class FindSmallestLargestValue {
    //?Pratik Sherdiwala (Codelytics)

    public static void main(String[] args) {
        findSmallestAndLargestElements(
                new int[]{20, 30, 70, 90, 10, 40}
        );
        System.out.println("---------------------------");
        findSmallestAndLargestElements(
                new int[]{-40, 0, 99, 135, 0, 1, 59}
        );
    }

    static void findSmallestAndLargestElements(int[] array) {
        int largestValue = 0;
        int smallestValue = Integer.MAX_VALUE;

        for (int element : array) {

            if (element > largestValue) {
                largestValue = element;
            }

            if (element < smallestValue) {
                smallestValue = element;
            }
        }
        System.out.println("For array :" + Arrays.toString(array));
        System.out.println("Smallest :" + smallestValue);
        System.out.println("Largest :" + largestValue);
    }
}

/*
*
? For array :[20, 30, 70, 90, 10, 40]
! Smallest :10
! Largest :90
---------------------------
? For array :[-40, 0, 99, 135, 0, 1, 59]
! Smallest :-40
! Largest :135
* */