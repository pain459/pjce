package c2_exercises;

import java.util.Scanner;

public class prog2_13 {
    public static void main(String[] args) {
        // finance calculator
        // yearly interest is 3.75
        // monthly saving input in dollars.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavings = input.nextDouble();
        System.out.print("Enter number of months for calculation: ");
        int _months = input.nextInt();
        double annualInterest = 3.75;
        double newBalance = 0;
        for (int i = 1; i <= _months; i++) {
            newBalance = (monthlySavings + newBalance) * (1 + annualInterest / 100 / 12);
            // newBalance = (monthlySavings + newBalance) * (1 + 0.003125);
            System.out.print("After the month " + i + ", the account value is $" + newBalance);
            System.out.printf(". Human friendly number %.3f\n", newBalance);
        }
    }
}
