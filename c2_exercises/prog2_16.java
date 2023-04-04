package c2_exercises;

import java.util.Scanner;

public class prog2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double _side = input.nextDouble();
        double _area = (3.0 * Math.sqrt(3)) / 2 * Math.pow(_side, 2);
        System.out.printf("The area of hexagon is %.4f\n", _area);
    }
}
