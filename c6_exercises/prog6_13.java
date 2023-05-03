public class prog6_13 {
    public static void main(String[] args) {
        System.out.println("Sum series");
        sumSeries(20);
    }

    public static void sumSeries (double _range) {
        System.out.printf("%2s%20s\n", "i", "m(i)");
        for (double i = 1; i <= _range; i++) {
            double _final = 0;
            for (double j = 1; j <= i; j++) {
                _final += j / (j + 2);
            }
            // System.out.printf("%2s%21.3f\n", (int) i, i / (i + 2));
            System.out.printf("%2s%21.4f\n", (int) i, _final);

            // System.out.println(i / (i + 2));
        }
    }
}
