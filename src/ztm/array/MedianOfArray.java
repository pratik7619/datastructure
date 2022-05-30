package ztm.array;

import java.util.Arrays;

public class MedianOfArray {
    //?Pratik Sherdiwala (Codelytics)

    //Brute Force
    static double findMedian(int[] arrayOne, int[] arrayTwo) {
        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];

        for (int i = 0; i < arrayOne.length; i++) {
            mergedArray[i] = arrayOne[i];
        }
        int currentIndex = 0;
        for (int i = mergedArray.length - arrayOne.length; i < mergedArray.length; i++) {
            if (currentIndex >= arrayTwo.length) {
                break;
            }
            mergedArray[i] = arrayTwo[currentIndex];
            currentIndex++;
        }

        int sum = 0;

        for (int num : mergedArray) {
            sum = sum + num;
        }

        return sum / (double) mergedArray.length;
    }

    public static void main(String[] args) {

        double median = findMedian(
                new int[]{1, 2, 3, 4},
                new int[]{1, 2, 3, 4, 5, 7, 33, 67}
        );

        System.out.println(median);
    }
}
