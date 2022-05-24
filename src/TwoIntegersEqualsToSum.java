import java.util.HashSet;
import java.util.Set;

public class TwoIntegersEqualsToSum {
    //?Pratik Sherdiwala (Codelytics)

    static boolean findSumOfTwo(int[] array, int sum) {

        //array  => | 5, 7, 1, 2, 8, 4
        //sum => 2

        Set<Integer> findValues = new HashSet<>();

        //findValues => 5 7 1 0

        for (int a : array) {
            //a | 2
            if (findValues.contains(sum - a)) {
                return true;
            }
            findValues.add(a);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] array = {5, 7, 1, 2, 8, 4};
        int[] test = {3, 20, 1, 4, 7};

        for (int a : test) {
            //a | 2
            boolean output = findSumOfTwo(array, a);
            System.out.println(a + " = " + output);
        }
    }
}
