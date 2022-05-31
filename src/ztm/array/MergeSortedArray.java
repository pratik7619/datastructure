package ztm.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    //?Pratik Sherdiwala (Codelytics)

    static int[] mergeSortedArray(int[] arrayOne, int[] arrayTwo) {

        final ArrayList<Integer> mergedArray = new ArrayList<>();

        int arrayItem1 = arrayOne[0];
        int arrayItem2 = arrayTwo[0];
        int i = 1;
        int j = 1;

        int totalLength = arrayOne.length + arrayTwo.length;

        while (totalLength != 0) {
            if (arrayItem1 < arrayItem2) {
                mergedArray.add(arrayItem1);
                arrayItem1 = arrayOne[i];
                i++;
            } else {
                mergedArray.add(arrayItem2);
                arrayItem2 = arrayTwo[j];
                j++;
            }

            totalLength--;
        }

        int[] finalMergedArray = new int[mergedArray.size()];

        for (int i1 = 0; i1 < mergedArray.size(); i1++) {
            finalMergedArray[i1] = mergedArray.get(i1);
        }

        return finalMergedArray;
    }

    public static void main(String[] args) {


        System.out.println(
                Arrays.toString(
                        mergeSortedArray(
                                new int[]{2, 3, 4, 5, 67},
                                new int[]{0, 6, 90, 100}
                        )
                )
        );
    }
}
