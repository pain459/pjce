import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args){
		// create a scanner
		Scanner input = new Scanner(System.in);

		// Enter annual interest rate in percentage eg. 7.5%
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Enter number of years
		System.out.print("Enter the number of years as integer: ");
		double numberOfYears = input.nextInt();

		// Enter loan amount
		System.out.print("Enter the loan amount: ");
		double loanAmount = input.nextDouble();

		// Calculte payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

		double totalPayment = monthlyPayment * numberOfYears * 12;

		// Display Results
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
	}
}