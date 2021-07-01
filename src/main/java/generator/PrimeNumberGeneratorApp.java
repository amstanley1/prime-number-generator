package generator;

import java.util.List;
import java.util.Scanner;

public class PrimeNumberGeneratorApp {

    public static void main(String args[]) {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("This app will generate a list of prime numbers for a given range.");
        System.out.println("Enter the first number of the range: ");
        int startInt = reader.nextInt();
        System.out.println("Enter the second number of the range: ");
        int lastInt = reader.nextInt();
        System.out.println();

        List<Integer> primeNumbers = primeNumberGenerator.generate(startInt, lastInt);

        if (primeNumbers.size() == 0) {
            System.out.println("No prime numbers in this range");
        } else {
            System.out.println("Prime numbers:");
            for(int i = 0; i < primeNumbers.size(); i++) {
                System.out.println(primeNumbers.get(i));
            }
        }

        reader.close();
    }
}
