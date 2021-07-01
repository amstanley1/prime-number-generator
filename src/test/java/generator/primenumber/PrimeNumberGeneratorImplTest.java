package generator.primenumber;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeNumberGeneratorImplTest {
    PrimeNumberGenerator primeNumberGenerator;

    @Before
    public void setup() {
        primeNumberGenerator = new PrimeNumberGeneratorImpl();
    }

    @Test
    public void shouldGeneratePrimeNumbersForRange() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(7900, 7920);
        assertThat(new ArrayList<>(List.of(7901, 7907, 7919)), is(equalTo(primeNumbersResult)));
    }

    @Test
    public void shouldGeneratePrimeNumbersInclusiveOfRangeStartAndEndValues() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(17, 31);
        assertThat(primeNumbersResult, hasItems(17, 31));
    }

    @Test
    public void shouldGeneratePrimeNumbersForInverseRange() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(10, 1);
        assertThat(new ArrayList<>(List.of(2, 3, 5, 7)), is(equalTo(primeNumbersResult)));
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithEqualStartAndEnd() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(10, 10);
        assertThat(new ArrayList<>(), is(equalTo(primeNumbersResult)));
    }

    @Test
    public void shouldGenerateSamePrimeNumbersForInverseRanges() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(50, 20);
        List<Integer> inverseRangeResult = primeNumberGenerator.generate(20, 50);
        assertThat(primeNumbersResult, is(equalTo(inverseRangeResult)));
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithNegativeStartValue() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(-5, 20);
        assertThat(new ArrayList<>(List.of(2, 3, 5, 7, 11, 13, 17, 19)), is(equalTo(primeNumbersResult)));
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithNegativeEndValue() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(5, -20);
        assertThat(new ArrayList<>(List.of(2, 3, 5)), is(equalTo(primeNumbersResult)));
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithNegativeStartAndEndValues() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(-5, -20);
        assertThat(new ArrayList<>(), is(equalTo(primeNumbersResult)));
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithStartValueZero() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(0, 12);
        assertThat(new ArrayList<>(List.of(2, 3, 5, 7, 11)), is(equalTo(primeNumbersResult)));
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithEndValueZero() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(12, 0);
        assertThat(new ArrayList<>(List.of(2, 3, 5, 7, 11)), is(equalTo(primeNumbersResult)));
    }

    @Test
    public void shouldGeneratePrimeNumbersForRangeWithStartAndEndValuesZero() {
        List<Integer> primeNumbersResult = primeNumberGenerator.generate(0, 0);
        assertThat(new ArrayList<>(), is(equalTo(primeNumbersResult)));
    }
}
