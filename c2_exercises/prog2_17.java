package c2_exercises;

import java.util.Scanner;

public class prog2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temparature in F between -58\u00B0F and 41\u00B0F: "); // printing the degree
                                                                                           // symbol.
        double _t_a = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double _v = input.nextDouble();

        double _t_wc = 35.74 + 0.621 * _t_a - 35.75 * Math.pow(_v, 0.16) + 0.4275 * _t_a * Math.pow(_v, 0.16);
        System.out.printf("The wind chill index is %.5f\n", _t_wc);
    }
}
