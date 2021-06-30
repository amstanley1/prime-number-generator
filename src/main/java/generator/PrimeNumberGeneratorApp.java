package generator;

import java.util.Scanner;

public class PrimeNumberGeneratorApp {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("This app will generate a list of prime numbers for a given range.");
        System.out.println("Enter the first number of the range: ");
        int startInt = reader.nextInt();
        System.out.println("Enter the second number of the range: ");
        int lastInt = reader.nextInt();

        if (startInt > lastInt) {
            int tempInt = startInt;
            startInt = lastInt;
            lastInt = tempInt;
        }

        reader.close();
    }
}
