package c2_exercises;

import java.util.Scanner;

public class prog2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 points of a triangle: ");
        double _x1 = input.nextDouble();
        double _y1 = input.nextDouble();
        double _x2 = input.nextDouble();
        double _y2 = input.nextDouble();
        double _x3 = input.nextDouble();
        double _y3 = input.nextDouble();
        double _s1 = Math.sqrt(Math.pow(_x2 - _x1, 2) + Math.pow(_y2 - _y1, 2));
        double _s2 = Math.sqrt(Math.pow(_x3 - _x2, 2) + Math.pow(_y3 - _y2, 2));
        double _s3 = Math.sqrt(Math.pow(_x1 - _x3, 2) + Math.pow(_y1 - _y3, 2));
        double _s = (_s1 + _s2 + _s3) / 2;
        double _area = Math.sqrt((_s * (_s - _s1)) * (_s - _s2) * (_s - _s3));
        System.out.printf("The area of the triangle is %.1f\n", _area);
    }
}
