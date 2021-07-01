package generator;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator {

    public List<Integer> generate(int startingValue, int endingValue) {
        int start = startingValue;
        int end = endingValue;
        if (start > end) {
            int tempValue = start;
            start = end;
            end = tempValue;
        }
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
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
