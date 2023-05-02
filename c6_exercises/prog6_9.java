public class prog6_9 {
    public static void main(String[] args) {
        System.out.println("Conversions between kilograms and pounds");
        displayChart(10);
    }

    public static double kiloGramToPound(double kilograms) {
        double pounds = 2.204 * kilograms;
        return pounds;
    }

    public static double poundToKilogram(double pound) {
        // int base = 20, increment = 5;
        double kilograms = pound / 2.204;
        return kilograms;
    }

    public static void displayChart(int iterations) {
        // miles to start at 1 and kilometers to start at 20 (with addition of 5) for
        // this program.
        System.out.println("Kilograms          Pounds          |          pounds          Kilograms");
        System.out.println("-----------------------------------------------------------------------");
        int base1 = 1, base2 = 20, increment1 = 2, increment2 = 5;
        for (int i = 1; i <= iterations; i++) {
            System.out.printf("%2d             %-12.3f", base1, kiloGramToPound(base1));
            base1 += increment1;
            System.out.printf("        |          ");
            System.out.printf("%2d                  %2.3f\n", base2, poundToKilogram(base2));
            base2 += increment2;
        }
    }
}
