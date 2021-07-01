package generator.primenumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImplTest {
    PrimeNumberGenerator primeNumberGenerator;

    @Before
    public void setup() {
        primeNumberGenerator = new PrimeNumberGeneratorImpl();
    }

    @Test
    public void shouldGeneratePrimeNumbersForRange() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(7900, 7920);
        Assert.assertEquals(new ArrayList<>(List.of(7901, 7907, 7919)), primeNumbersResult);
    }

    @Test
    public void shouldGeneratePrimeNumbersForInverseRange() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(10, 1);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7)), primeNumbersResult);
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithEqualStartAndEnd() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(10, 10);
        Assert.assertEquals(new ArrayList<>(), primeNumbersResult);
    }

    @Test
    public void shouldGenerateSamePrimeNumbersForInverseRanges() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(50, 20);
        List<Integer> inverseRangeResult = primeNumberGenerator.generate(20, 50);
        Assert.assertEquals(primeNumbersResult, inverseRangeResult);
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithNegativeStartValue() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(-5, 20);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7, 11, 13, 17, 19)), primeNumbersResult);
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithNegativeEndValue() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(5, -20);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5)), primeNumbersResult);
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithNegativeStartAndEndValues() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(-5, -20);
        Assert.assertEquals(new ArrayList<>(), primeNumbersResult);
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithStartValueZero() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(0, 12);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7, 11)), primeNumbersResult);
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithEndValueZero() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(12, 0);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7, 11)), primeNumbersResult);
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithStartAndEndValuesZero() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(0, 0);
        Assert.assertEquals(new ArrayList<>(), primeNumbersResult);
    }
}
