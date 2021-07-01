package generator.primenumber;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator {

    public List<Integer> generate(int startingValue, int endingValue) {
        int max = Math.max(startingValue, endingValue);
        max = Math.max(0, max);

        int min = Math.min(startingValue, endingValue);
        min = Math.max(0, min);

        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
