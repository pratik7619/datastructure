package ztm.array;

public class ContainerWithMostWater {
    //?Pratik Sherdiwala (Codelytics)

    //!Brute force solution
    static int maxArea(int[] array) {

        int maxArea = 0;

        for (int left = 0; left < array.length; left++) {

            for (int right = left + 1; right < array.length; right++) {

                int width = right - left;

                maxArea = Math.max(
                        maxArea,
                        Math.min(array[left], array[right]) * width
                );
            }
        }
        return maxArea;
    }

    //? Efficient solution
    static int findMaxArea(int[] array) {
        int maxArea = 0;

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int width = right - left;

            maxArea = Math.max(
                    maxArea,
                    Math.min(array[left], array[right]) * width
            );

            if (array[left] <= array[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(
                findMaxArea(
                        new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}
                )
        );
        System.out.println("--------------------");
        System.out.println(
                maxArea(
                        new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}
                )
        );
    }
}
