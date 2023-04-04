package c2_exercises;

import java.util.Scanner;

public class prog2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double _x1 = input.nextDouble();
        double _y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double _x2 = input.nextDouble();
        double _y2 = input.nextDouble();
        double _distance = Math.sqrt(Math.pow(_x2 - _x1, 2) + Math.pow(_y2 - _y1, 2));
        System.out.println("The distance between the two points is: " + _distance);
    }
}
