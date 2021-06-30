package generator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorImplTest {

    @Test
    public void shouldBeAbleToGenerateListOfPrimeNumbers() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImp();

        List<Integer> primeNumbers = primeNumberGenerator.generate(7900, 7920);
        Assert.assertEquals(primeNumbers, new ArrayList<>(List.of(7901, 7907, 7919)));
    }
}
