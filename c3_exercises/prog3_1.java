package c3_exercises;

import java.util.Scanner;

public class prog3_1 {
    // Solving quadratic equations and finding real roots.\
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double _a = input.nextDouble();
        double _b = input.nextDouble();
        double _c = input.nextDouble();
        // calculating discriminant
        double _discriminant = Math.pow(_b, 2) - 4 * _a * _c;
        double _r1 = (-_b + Math.sqrt(_discriminant)) / 2 * _a;
        double _r2 = (-_b - Math.sqrt(_discriminant)) / 2 * _a;
        if (_discriminant > 0) {
            System.out.printf("There equation has two roots %.5f and %.5f\n", _r1, _r2);
        } else if (_discriminant == 0) {
            if (_r1 == _r2) {
                System.out.printf("There is 1 root %d\n", (int) _r1);
            }
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
