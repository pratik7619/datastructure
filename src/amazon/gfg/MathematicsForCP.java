package amazon.gfg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MathematicsForCP {
    //?Pratik Sherdiwala (Codelytics)

    static Boolean[] seiveOfEratoSthenis(int range) {
        Boolean[] isPrimes = new Boolean[range + 1];

        Arrays.fill(isPrimes, true);
        isPrimes[0] = false;
        isPrimes[1] = false;

        for (int i = 2; i * i <= range; i++) {
            for (int j = 2 * i; j <= range; j += i) {
                isPrimes[j] = false;
            }
        }

        return isPrimes;
    }

    public static void main(String[] args) {

        Boolean[] primes = seiveOfEratoSthenis(20);

        for (int i = 0; i < primes.length; i++) {
            System.out.println(i + " " + primes[i]);
        }

        long count = Arrays
                .stream(primes)
                .filter(s -> s)
                .count();

        System.out.println(count);
    }
}
