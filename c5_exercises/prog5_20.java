public class prog5_20 {
    public static void main(String[] args) {
        int nextLineCount = 0;
        for (int i = 1; i <= 1200; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                nextLineCount++;
                if (nextLineCount == 8) {
                    System.out.println("");
                    nextLineCount = 0;
                }
            }
        }
    }

    static boolean isPrime(int n) {
        boolean notPrime = false;
        int d = 2;
        while (d <= n/2) {
            if (n % d == 0) {
                notPrime = true;
                break;
            }
            d++;
        }
        return !notPrime;
    }
}
