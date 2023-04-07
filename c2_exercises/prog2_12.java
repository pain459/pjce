package c2_exercises;

import java.util.Scanner;

public class prog2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double _speed = input.nextDouble();
        double _acceleration = input.nextDouble();
        // we are calculating the 46th iter per requirement.
        double _a46 = _speed + ((46.0 - 1) * _acceleration);
        System.out.println("The minimum runway length for this airplane is " + _a46);
    }
}
