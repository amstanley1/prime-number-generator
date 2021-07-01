package generator;

import generator.primenumber.PrimeNumberGenerator;
import generator.primenumber.PrimeNumberGeneratorImpl;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GeneratorApp {

    public static void main(String args[]) {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGeneratorImpl();

        Scanner reader = new Scanner(System.in);
        int startInt = 0;
        int lastInt = 0;
        System.out.println("This app will generate a list of prime numbers for a given range.");
        try {
            System.out.println("Enter the first number of the range: ");
            startInt = reader.nextInt();
            System.out.println("Enter the second number of the range: ");
            lastInt = reader.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Invalid input entered.");
        }
        System.out.println();

        List<Integer> primeNumbers = primeNumberGenerator.generate(startInt, lastInt);

        if (primeNumbers.size() == 0) {
            System.out.println("No prime numbers found.");
        } else {
            System.out.println("Prime numbers:");
            for(int i = 0; i < primeNumbers.size(); i++) {
                System.out.println(primeNumbers.get(i));
            }
        }
        reader.close();
    }
}
