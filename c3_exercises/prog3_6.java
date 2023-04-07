import java.util.Scanner;

public class prog3_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt the user to enter weight in pounds
		System.out.print("Enter the weight in pounds: ");
		int _weight = input.nextInt();
		System.out.print("Enter the height in feet: ");
		int _feet = input.nextInt();
		System.out.print("Enter the rest in inches: ");
		int _inches = input.nextInt();
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METER_PER_FEET = 0.3048;

		// compute BMI and weight conversion logic
		double weightInKilograms = _weight * KILOGRAMS_PER_POUND;
		double heightInMeters = METER_PER_FEET * (_feet + ((double) _inches / 12));
		double _bmi = weightInKilograms / Math.pow(heightInMeters, 2);
		// Display result
		System.out.println("BMI is " + _bmi);		
	}
}
