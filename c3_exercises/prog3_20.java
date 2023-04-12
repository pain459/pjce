import java.util.Scanner;

public class prog3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temparature in F between -58\u00B0F and 41\u00B0F: "); // printing the degree
                                                                                           // symbol.
        double _t_a = input.nextDouble();
        String _msg = " is invalid. Program will now exit.";
        if (_t_a < -58 || _t_a > 48) {
            System.out.println("Temparature" + _msg);
            System.exit(1);
        }
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double _v = input.nextDouble();
        if (_v > 2) {
            System.out.println("Speed" + _msg);
            System.exit(1);
        }

        double _t_wc = 35.74 + 0.621 * _t_a - 35.75 * Math.pow(_v, 0.16) + 0.4275 * _t_a * Math.pow(_v, 0.16);
        System.out.printf("The wind chill index is %.5f\n", _t_wc);
    }
}
