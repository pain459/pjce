public class prog5_5 {
    public static void main(String[] args) {
        System.out.printf("Converstion from C\u00B0 to F\u00B0\n");
        int chartLimit = 0;
        System.out.println("Celsius  Fahrenheit  |  Fahrenheit  Celsius");
        while (chartLimit <= 10) {
            double _c = (double) chartLimit;
            double _f =  _c * 9 / 5 + 32;
            System.out.printf("%-7s  %10s  |  %-10s  %7s\n", _c, _f, _f, _c);
            chartLimit++;
        }
    }
}
