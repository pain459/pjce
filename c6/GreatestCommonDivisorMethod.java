package c6;
import java.util.Scanner;
public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the GCD computation program.");
        System.out.print("Enter the first integer to calculate GCD: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer to calculate GCD: ");
        int num2 = input.nextInt();

        System.out.println("Entered numbers are num1 " + num1 + " and num2 " + num2);
        System.out.println("The greatest common divisors is " + calculateGCD(num1, num2));
    }

    public static int calculateGCD(int i1, int i2) {
        int gcd = 1; // Initial gcd is 1
        int k = 2; // possible gcd is 1

        while (k <= i1 && k <= i2) {
            if (i1 % 2 == 0 && i2 % 2 == 0) {
                gcd = k;
            }
            k++;
        }

        return gcd;  // Returning the result
    }
}
