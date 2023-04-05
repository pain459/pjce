package c3_exercises;

import java.util.Scanner;

public class prog3_3 {
    public static void main(String[] args) {
        System.out.println("This program will solve for x and y using cramers rule.");
        Scanner input = new Scanner(System.in);
        // double a, b, c, d, e, f = 0;
        System.out.print("Enter a b c d e f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        if (((a * d) - (b * c)) == 0) {
            System.out.println("This equation had no solution.");
        } else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("Calculated x is: " + x);
            System.out.println("Calculated y is: " + y);
        }
    }
}