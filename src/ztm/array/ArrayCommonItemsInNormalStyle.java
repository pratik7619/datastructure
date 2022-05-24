package ztm.array;

/*
 * Given 2 arrays, create a function that let's user know (true, false)
 * whether two array contains any common items
 * */
public class ArrayCommonItemsInNormalStyle {
    //?Pratik Sherdiwala (Codelytics)

    static boolean hasCommonItem(int[] arrayOne, int[] arrayTwo) {
        for (int numFromArrayOne : arrayOne) {
            for (int numFromArrayTwo : arrayTwo) {
                if (numFromArrayOne == numFromArrayTwo) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(
                hasCommonItem(
                        new int[]{1, 4, 5, 6, 7, 9},
                        new int[]{3, 4, 5, 6, 7, 8}
                )
        );

        System.out.println(
                hasCommonItem(
                        new int[]{1, 4, 5, 6, 7, 9},
                        new int[]{12, 45, 78, 90}
                )
        );
    }
}
