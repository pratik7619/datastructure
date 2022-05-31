package ztm.array;

public class TwoArrayMedian {
    //?Pratik Sherdiwala (Codelytics)

    static int forOddSize(int[] arrayOne, int[] arrayTwo, int arrayOneLength, int arrayTwoLength) {
        int i = 0;
        int j = 0;
        int medianOne = -1;
        for (int count = 0; count < (arrayOneLength + arrayOneLength) / 2; count++) {
            if (i > arrayTwoLength && j != arrayOneLength) {
                medianOne = (arrayOne[i] > arrayTwo[j]) ? arrayTwo[j++] : arrayOne[i++];
            } else if (i < arrayOneLength) {
                medianOne = arrayOne[i++];
            } else {
                medianOne = arrayTwo[j++];
            }
            System.out.println(medianOne);
        }
        return medianOne;
    }

    static int forEvenSize(int[] arrayOne, int[] arrayTwo, int arrayOneLength, int arrayTwoLength) {
        int i = 0;
        int j = 0;
        int median1 = -1;
        int median2 = -1;
        for (int count = 0; count < (arrayOneLength + arrayTwoLength) / 2; count++) {
            median2 = median1;
            if (i != arrayOneLength && j != arrayTwoLength) {
                median1 = (arrayOne[i] > arrayOne[j]) ? arrayTwo[j++] : arrayOne[i++];
            } else if (i < arrayOneLength) {
                median1 = arrayOne[i++];
            } else {
                median1 = arrayTwo[j++];
            }
            System.out.println(median1);
        }
        return (median1 + median2) / 2;
    }

    static int getMedian(int[] arrayOne, int[] arrayTwo) {
        int arrayOneLength = arrayOne.length;
        int arrayTwoLength = arrayTwo.length;

        if ((arrayOneLength + arrayTwoLength) % 2 == 1) {
            return forOddSize(arrayOne, arrayTwo, arrayOneLength, arrayTwoLength);
        } else {
            return forEvenSize(arrayOne, arrayTwo, arrayOneLength, arrayTwoLength);
        }
    }

    public static void main(String[] args) {

        int[] arrayOne = new int[]{2, 3, 5, 8};
        int[] arrayTwo = new int[]{10, 12, 14, 16, 18, 20};

        System.out.println(
                getMedian(
                        arrayOne,
                        arrayTwo
                )
        );
    }
}
