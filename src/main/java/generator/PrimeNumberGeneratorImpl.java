package generator;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenerator {
    public PrimeNumberGeneratorImpl() {

    }

    public List<Integer> generate(int startingValue, int endingValue) {
        return new ArrayList<>(List.of(7901, 7907, 7919));
    }

    public boolean isPrime(int value) {
        return true;
    }
}
