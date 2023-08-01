package c12.exception_examples;
import java.util.Scanner;

public class TestingFinally {
    public static void main(String[] args) {
        System.out.println("This program is to test the finally clause in exception handling.");
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter an integer number: ");
            int i = input.nextInt();
            if (i < 0) {
                throw new RuntimeException("You entered a negative number.");
            } else if (i > 10) {
                throw new RuntimeException("You entered a number greater than " + i);
            } else if ((i == (double) i) && !Double.isFinite(i)) {
                throw new RuntimeException("It isn't an integer.");
            } else {
                System.out.println("Entered number is " + i);
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Block finally executed.");
        }
    }
}
