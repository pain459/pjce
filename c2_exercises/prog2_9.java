package c2_exercises;

import java.util.Scanner;

public class prog2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1 and t: ");
        double _v0 = input.nextDouble();
        double _v1 = input.nextDouble();
        double _t = input.nextDouble();

        double _a = (_v1 - _v0) / _t;
        System.out.println("The average acceleration is " + _a);
        System.out.printf("The average acceleration is %.3f\n", _a);
    }
}
