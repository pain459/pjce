package c10.Loan;
import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        // Enter annual interest rate
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        // Enter number of years
        System.out.print("Enter the number of years as an integer: ");
        int numberOfYears = input.nextInt();
        // Enter loan amount
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();
        // create a loan object
        Loan l1 = new Loan(annualInterestRate, numberOfYears, loanAmount);
        // Display loan date, monthly payment and total payment
        System.out.printf("The loan was created in %s\n" +
                "The monthly payment is %.2f\nThe total payment is %.2f\n",
                l1.getLoanDate().toString(), l1.getMonthlyPayment(), l1.getTotalPayment());
    }
}
