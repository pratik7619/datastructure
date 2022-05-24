import java.util.Arrays;

public class ShiftZeroToLeftSideArray {
    //?Pratik Sherdiwala (Codelytics)

    static void moveZerosToLeft(int[] array) {

        if (array.length < 1) return;

        int writeIndex = array.length - 1;
        int readIndex = array.length - 1;

        while (readIndex >= 0) {
            if (array[readIndex] != 0) {
                array[writeIndex] = array[readIndex];
                writeIndex--;
            }
            readIndex--;
        }

        while (writeIndex >= 0) {
            array[writeIndex] = 0;
            writeIndex--;
        }
    }

    public static void main(String[] args) {

        int[] v = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
        System.out.println("Original Array: " + Arrays.toString(v));

        moveZerosToLeft(v);

        System.out.println("After Moving Zeroes to Left: " + Arrays.toString(v));
    }
}
