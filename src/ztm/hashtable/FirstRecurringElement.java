package ztm.hashtable;

import java.util.Hashtable;

public class FirstRecurringElement {
    //?Pratik Sherdiwala (Codelytics)

    //Time Complexity -> O(n^2)
    static int firstRecurringElementUsingBruteForce(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    return array[i];
            }
        }
        return -1;
    }

    //Time Complexity -> O(n)
    static int firstRecurringElement(int[] array) {

        Hashtable<Integer, Integer> elementCounterTracker = new Hashtable<>();

        for (int i = 0; i < array.length; i++) {
            if (elementCounterTracker.containsKey(array[i])) {
                return array[i];
            }
            elementCounterTracker.put(array[i], i);
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(
                firstRecurringElementUsingBruteForce(
                        new int[]{1, 2, 4, 5, 5, 7, 6, 7, 7}
                )
        );
        System.out.println("===================================");
        System.out.println(
                firstRecurringElement(new int[]{1, 2, 4, 5, 6})
        );
    }
}
