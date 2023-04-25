public class prog5_25 {
    public static void main(String[] args) {
        int _iterations = 100000;
        double _result = 0;
        System.out.println("Compute PI");
        for (int i = 10000; i <= 100000; i += 10000) {
            for (double j = 1; j <= i; j++) {
                // _result += ((1.0 / ((2.0 * j) - 1.0)) - (1.0 / ((2.0 * j) + 1.0)));
                _result += Math.pow(-1, j + 1) / ((2 * j) - 1);
            }
            System.out.println("Pi for " + i + " iterations is " + 4 * (_result));
            _result = 0;
        }
    }
}
