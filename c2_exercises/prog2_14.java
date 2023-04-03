package c2_exercises;

import java.util.Scanner;

public class prog2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate BMI.");
        System.out.print("Enter the weight in pounds: ");
        double _weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double _height = input.nextDouble();

        double _BMI = (_weight * 0.45359237) / Math.pow(_height * 0.0254, 2);
        System.out.printf("BMI is %.4f\n", _BMI);
    }
}
