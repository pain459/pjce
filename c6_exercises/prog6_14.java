public class prog6_14 {
    public static void main(String[] args) {
        System.out.printf("Estimate \u03c0\n");  // printing pi using unicode notation
        estimatePiIterations(901);
    }

    public static void estimatePiIterations (double n) {
        System.out.printf("%s%20s\n", "i", "m(i)");

        for (double i = 1; i <= n; i+=100) {
            double _approximation = 0;
            for (double j = 1; j <= i; j++) {
                _approximation += Math.pow(-1, j + 1) / ((2 * j) - 1);
            }
            System.out.printf("%3s%21.4f\n", (int) i, 4 * _approximation);
        }
    }
}
