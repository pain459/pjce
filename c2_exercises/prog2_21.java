package c2_exercises;

import java.util.Scanner;

class prog2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 100; // converting annual interest to interest rate.
        // https://www.investopedia.com/terms/f/futurevalue.asp
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears);
        System.out.printf("Accumulated value is $%.3f", futureInvestmentValue);
    }
}