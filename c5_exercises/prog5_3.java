public class prog5_3 {
    public static void main(String[] args) {
        System.out.printf("Converstion from C\u00B0 to F\u00B0\n"); // printing degree symbol to satisfy UI.
        int chartLimit = 0;
        System.out.println("Celsius \t Fahrenheit");
        while (chartLimit <= 100) {
            double _c = (double) chartLimit;
            double _f =  _c * 9 / 5 + 32;
            System.out.printf("%7s \t %10s\n", _c, _f);
            chartLimit++;
        }
    }
}
