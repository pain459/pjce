public class prog6_8 {
    public static void main(String[] args) {
        System.out.println("Conversions between mile and kiliometer");
        displayChart(10);
    }

    public static double mileToKilometer(double mile) {
        double inKilometers = mile * 1.60934;
        return inKilometers;
    }

    public static double kilometerToMile(double kilometer) {
        // int base = 20, increment = 5;
        double inMiles = kilometer / 1.60934;
        return inMiles;
    }

    public static void displayChart(int iterations) {
        // miles to start at 1 and kilometers to start at 20 (with addition of 5) for
        // this program.
        System.out.println("Miles          Kilometers          |          Kilometers          Miles");
        System.out.println("-----------------------------------------------------------------------");
        int base = 20, increment = 5;
        for (int i = 1; i <= iterations; i++) {
            System.out.printf("%2d             %-12.3f", i, mileToKilometer(i));
            System.out.printf("        |          ");
            System.out.printf("%2d                  %2.3f\n", base, kilometerToMile(base));
            base += increment;
        }
    }
}
