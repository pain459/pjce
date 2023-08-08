package c12.exception_examples;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchException {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        try {
            System.out.print("Enter an int number: ");
            if (input.nextInt() >= 10) {  // If we enter less than 10, control transfers to next else if statement
                System.out.println("Number greater than or equal 10");
            } else if (input.nextInt() < 10) {  // If we enter greater than 10, control transfers to next else statement
                throw new ArithmeticException("Less than expected range");
            } else {
                throw new NullPointerException("just null");
            }
        } catch (ArithmeticException | InputMismatchException | UnsupportedOperationException | NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
