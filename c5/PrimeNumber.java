package c5;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of primes to display: ");
        int user_input = input.nextInt();

        final int NUMBER_OF_PRIMES = user_input;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first " + user_input + " prime numbers are \n");

        // repeatedly find prime numbers.
        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                }
                else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
}
