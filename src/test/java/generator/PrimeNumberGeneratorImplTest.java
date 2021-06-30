package generator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImplTest {

    @Test
    public void shouldBeAbleToGenerateListOfPrimeNumbersBetween7900And7920() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> primeNumbers = primeNumberGenerator.generate(7900, 7920);
        Assert.assertEquals(new ArrayList<>(List.of(7901, 7907, 7919)), primeNumbers);
    }

    @Test
    public void shouldBeAbleToGenerateListOfPrimeNumbersBetween1And10() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> primeNumbers = primeNumberGenerator.generate(1, 10);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7)), primeNumbers);
    }

    @Test
    public void shouldBeAbleToGenerateListOfPrimeNumbersBetween10And1() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> primeNumbers = primeNumberGenerator.generate(10, 1);
        Assert.assertEquals(new ArrayList<>(List.of(2, 3, 5, 7)), primeNumbers);
    }
}
