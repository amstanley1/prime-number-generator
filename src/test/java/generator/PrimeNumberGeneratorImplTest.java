package generator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImplTest {

    @Test
    public void shouldBeAbleToGenerateListOfPrimeNumbersBetween7900And7920() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> primeNumbersResult = primeNumberGenerator.generate(7900, 7920);
        Assert.assertEquals(new ArrayList<>(List.of(7901, 7907, 7919)), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGenerateListOfPrimeNumbersBetween1And10() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> primeNumbersResult = primeNumberGenerator.generate(1, 10);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7)), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGenerateListOfPrimeNumbersBetween10And1() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> primeNumbersResult = primeNumberGenerator.generate(10, 1);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7)), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGenerateEmptyListOfPrimeNumbersBetween10And10() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> primeNumbersResult = primeNumberGenerator.generate(10, 10);
        Assert.assertEquals(new ArrayList<>(), primeNumbersResult);
    }

    @Test
    public void shouldBeAbleToGenerateSamePrimeNumbersFrom20To50AndFrom50To20() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> primeNumbersResult = primeNumberGenerator.generate(50, 20);
        List<Integer> switchedRangeResult = primeNumberGenerator.generate(20, 50);
        Assert.assertEquals(primeNumbersResult, switchedRangeResult);
    }

    @Test
    public void shouldBeAbleToGenerateNoPrimeNumbersForRangeWithNegativeStartingValue() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> primeNumbersResult = primeNumberGenerator.generate(-5, 20);
        List<Integer> switchedRangeResult = primeNumberGenerator.generate(2, 20);
        Assert.assertEquals(primeNumbersResult, switchedRangeResult);
    }
}
