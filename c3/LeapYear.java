import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // initiate scanner
        Scanner input = new Scanner(System.in);

        // take the year input.
        System.out.println("Welcome to the leap year checker program.");
        System.out.print("Enter the year to check if it a leap year: ");
        long input_year = input.nextLong();

        if (input_year < 0) {
            System.out.println("Input year is not valid. Program will exit.");
            System.exit(1);
        }
        System.out.println("You have entered year as: " + input_year);

        if ((input_year % 4 == 0) && (input_year % 100 != 0) || (input_year % 400 == 0)) {
            System.out.println("Yes! " + input_year + " is a leap year.");
        }
        else {
            System.out.println("Sorry! " + input_year + " is not a leap year");
        }
    }
}
