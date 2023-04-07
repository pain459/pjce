package c2_exercises;

import java.util.Scanner;

public class prog2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (eg 3 for 3%): ");
        double _balance = input.nextDouble();
        double _percent = input.nextDouble();
        double _interest = _balance * (_percent / 1200);
        System.out.printf("The interest is %.4f\n", _interest);
    }
}
