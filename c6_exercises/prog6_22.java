public class prog6_22 {
    public static void main(String[] args) {
        System.out.println("Math: approximate the square root");
        System.out.println(sqrt(9));
    }

    public static double sqrt(long n) {
        double nextGuess = 1, lastGuess = 1;
        boolean rootFound = false;
        while (!rootFound) {
            System.out.print("In while loop ");
            nextGuess = (lastGuess + (double) n / lastGuess) / 2;
            // lastGuess = nextGuess;
            if (nextGuess - lastGuess <= 0.00001) {
                rootFound = true;
                System.out.println("In the if condition.");
                // continue;
            } else {
                lastGuess = nextGuess;
            }
        }
        return nextGuess;
    }
}
