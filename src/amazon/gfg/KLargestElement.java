package amazon.gfg;

import java.util.PriorityQueue;

public class KLargestElement {
    //?Pratik Sherdiwala (Codelytics)

    static int kThLargestElement(int[] array, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            priorityQueue.add(array[i]);
        }

        Integer lastValue = priorityQueue.peek();

        for (int i = k; i < array.length; i++) {
            if (lastValue != null) {
                if (lastValue < array[i]) {
                    priorityQueue.poll();
                    priorityQueue.add(array[i]);
                }
            }
        }

        return lastValue == null ? 0 : lastValue;
    }

    public static void main(String[] args) {

        System.out.println(
                kThLargestElement(
                        new int[]{5, 7, 9, 3, 15, 23, 33, 2},
                        1
                )
        );
    }
}
