package generator;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator {
    public PrimeNumberGeneratorImpl() {

    }

    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = startingValue; i <= endingValue; i++) {
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
