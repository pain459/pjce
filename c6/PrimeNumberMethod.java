package c6;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime number are: ");
        // method invocation
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0; // count the number of prime numbers
        int number = 2; // a number to be tested for primeness

        // repeatedly find prime numbers
        while (count < numberOfPrimes) {
            // print the prime number and increase the count.
            // other method name is isPrime
            if (isPrime(number)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5s\n", number);
                }
                else {
                    System.out.printf("%-5s", number);
                }
            }
            number++;
        }      
    }
    // checking of the number is prime
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;        
    }
}
