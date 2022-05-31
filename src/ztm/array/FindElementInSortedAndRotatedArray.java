package ztm.array;

public class FindElementInSortedAndRotatedArray {
    //?Pratik Sherdiwala (Codelytics)

    static int binarySearch(int[] array, int element, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If found at mid, then return it
            if (array[mid] == element)
                return mid;

            // Search the left half
            if (array[mid] > element)
                return binarySearch(array, element, low, mid - 1);

            // Search the right half
            return binarySearch(array, element, mid + 1, high);
        }

        return -1;
    }

    static int binarySearchString(
            String[] stringArray,
            String element,
            int low,
            int high
    ) {

        if (high >= low) {

            int mid = low + (high - low) / 2;

            int comparedResult = element.compareTo(stringArray[mid]);

            if (element.compareTo(stringArray[mid]) == 0)
                return mid;
            else if (comparedResult > 0)
                return binarySearchString(stringArray, element, low, mid - 1);

            return binarySearchString(stringArray, element, mid + 1, high);
        }
        
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};

        System.out.println(
                binarySearch(
                        array,
                        40,
                        0,
                        array.length - 1
                )
        );

        System.out.println(
                binarySearchString(
                        new String[]{"abc", "def", "gef"},
                        "abc",
                        0,
                        2
                )
        );
    }
}
