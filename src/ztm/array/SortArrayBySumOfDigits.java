package ztm.array;

import java.util.HashMap;
import java.util.TreeMap;

public class SortArrayBySumOfDigits {
    //?Pratik Sherdiwala (Codelytics)

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int reminder = num % 10;
            sum += reminder;
            num = num / 10;
        }
        return sum;
    }

    static void sortArray(int[] array) {
        TreeMap<Integer, Integer> values = new TreeMap<>();

        for (int num : array) {
            values.put(sumOfDigits(num), num);
        }

        System.out.println(values);

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) values.values().toArray()[i];
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello");

        int[] array = {97, 27, 33, 10, 34, 55, 99};

        sortArray(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
