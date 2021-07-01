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
    public void shouldBeAbleToGeneratePrimeNumbersFromRange() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(7900, 7920);
        Assert.assertEquals(new ArrayList<>(List.of(7901, 7907, 7919)), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGeneratePrimeNumbersFromInverseRange() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(10, 1);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7)), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGeneratePrimeNumbersFromRangeOfSameNumber() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(10, 10);
        Assert.assertEquals(new ArrayList<>(), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGenerateSamePrimeNumbersForInverseRanges() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(50, 20);
        List<Integer> inverseRangeResult = primeNumberGenerator.generate(20, 50);
        Assert.assertEquals(primeNumbersResult, inverseRangeResult);
    }

    @Test
    public void shouldBeAbleToGeneratePrimeNumbersForRangeWithNegativeStartValue() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(-5, 20);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7, 11, 13, 17, 19)), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGeneratePrimeNumbersForRangeWithNegativeEndValue() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(5, -20);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5)), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGeneratePrimeNumbersForRangeWithNegativeStartAndEndValues() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(-5, -20);
        Assert.assertEquals(new ArrayList<>(), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGeneratePrimeNumbersForRangeWithStartValueZero() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(0, 12);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7, 11)), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGeneratePrimeNumbersForRangeWithEndValueZero() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(12, 0);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7, 11)), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGeneratePrimeNumbersForRangeWithStartAndEndValuesZero() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(0, 0);
        Assert.assertEquals(new ArrayList<>(), primeNumbersResult);
    }
}
