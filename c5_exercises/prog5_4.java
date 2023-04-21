public class prog5_4 {
    public static void main(String[] args) {
        System.out.printf("Converstion from Inches to Centimeters\n"); // printing degree symbol to satisfy UI.
        int chartLimit = 0;
        System.out.println("Inches \t\t Centimeters");
        while (chartLimit <= 100) {
            double _i = (double) chartLimit;
            double _c =  _i * 2.54;
            System.out.printf("%-7s \t %-11.2f\n", _i, _c);
            chartLimit++;
        }
    }
}
