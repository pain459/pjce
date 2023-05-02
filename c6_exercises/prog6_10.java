public class prog6_10 {
    public static void main(String[] args) {
        System.out.println("Printing primes till certain limit");
        printPrimes(1000);

    }

    public static boolean isPrime(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printPrimes(int number) {
        int counter = 1;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                if (counter == 10) {
                    System.out.printf("%4d \n", i);
                    counter = 1;
                } else {
                    System.out.printf("%4d ", i);
                    counter++;
                }
            }
        }
    }
}
