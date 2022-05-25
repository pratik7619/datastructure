package ztm.array;

import java.util.HashMap;

class Pair<T1, T2> {
    T1 first;
    T2 second;

    Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
}

public class FindABEqualsCD {
    //?Pratik Sherdiwala (Codelytics)
    /*
    * Find four elements a, b, c and d in an array such that a+b = c+d
    *
    * Given an array of distinct integers,
    * find if there are two pairs (a, b) and (c, d)
    * such that a+b = c+d, and a, b, c and d are distinct elements.
    * If there are multiple answers, then print any of them.
    *
    ? Example
         Input:   {3, 4, 7, 1, 2, 9, 8}
         Output:  (3, 8) and (4, 7)
         Explanation: 3+8 = 4+7
    * */

    //! this method can return all possible pairs for sum
    static void findTwoPoints(int[] array) {

        HashMap<Integer, Pair<Integer, Integer>> sumValues = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];

                if (!sumValues.containsKey(sum)) {
                    sumValues.put(sum, new Pair<Integer, Integer>(i, j));
                } else {
                    Pair<Integer, Integer> pair = sumValues.get(sum);
                    System.out.println(
                            "(" + array[pair.first] + " " + array[pair.second] + "),"
                                    + "(" + array[i] + " " + array[j] + ")"
                    );
                }
            }
        }
    }

    public static void main(String[] args) {
        findTwoPoints(
                new int[]{4, 5, 6, 8, 2, 0}
        );
    }
}
