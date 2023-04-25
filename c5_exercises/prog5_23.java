public class prog5_23 {
    public static void main(String[] args) {
        System.out.println("Demonstration cancellation errors");
        int _iterations = 50000;
        double result = 1;
        // counting from left to right
        for (int i = 1; i <= _iterations; i++) {
            result += 1.0 / i;
        }
        System.out.println("Result of the series from left to right: " + result);
        // counting from right to left
        for (int j = _iterations; j >= 1; j--) {
            result += 1.0 / j;
        }
        System.out.println("Result of the series from right to left: " + result);

    }
}
