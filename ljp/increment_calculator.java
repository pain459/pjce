import java.util.Scanner;

public class increment_calculator {
	public static void main(String[] args){
		// Initiate scanner
		Scanner input = new Scanner(System.in);

		// Take user input of salary
		System.out.print("Please enter the current salary: ");
		double user_salary = input.nextDouble();

		// Enter the increment received.
		System.out.print("Enter the received increment percent: ");
		double user_increment = input.nextDouble();

		// calculate new salary
		double new_salary = user_salary + ((user_increment / 100) * user_salary);

		// salary increased by 
		double increase_in_salary = new_salary - user_salary;

		// print results
		System.out.println("Your current salary is " + user_salary + " and you received an increment of " + user_increment + "%. Your new salary is " + new_salary + ". So your net salary increase is " + increase_in_salary);
		
	}
}