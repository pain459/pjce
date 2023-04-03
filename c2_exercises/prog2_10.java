package c2_exercises;

import java.util.Scanner;

public class prog2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilogram: ");
        double waterWeight = input.nextDouble();
        System.out.print("Enter the initial temparature: ");
        double initialTemparature = input.nextDouble();
        System.out.print("Enter the final temparature: ");
        double finalTemparature = input.nextDouble();

        double _Q = waterWeight * (finalTemparature - initialTemparature) * 4184;
        System.out.println("The energy needed is " + _Q);
    }
}
