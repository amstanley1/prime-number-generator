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
        while (true) {
            try {
                System.out.println("Enter the first number of the range: ");
                startInt = reader.nextInt();
                reader.nextLine();
                System.out.println("Enter the second number of the range: ");
                lastInt = reader.nextInt();
                reader.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                reader.nextLine();
            }
            System.out.println();

            List<Integer> primeNumbers = primeNumberGenerator.generate(startInt, lastInt);

            if (primeNumbers.size() == 0) {
                System.out.print("No prime numbers found for the entered range.");
            } else {
                System.out.println("Prime numbers:");
                for(int i = 0; i < primeNumbers.size(); i++) {
                    System.out.print(primeNumbers.get(i));
                    if (i != primeNumbers.size() - 1) {
                        System.out.print(", ");
                        if (i % 25 == 0) {
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("Would you like to enter another range? Y/N");
            String userSelection = reader.nextLine();
            if (userSelection.equalsIgnoreCase("y") || userSelection.equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }
        }
        reader.close();
    }
}
