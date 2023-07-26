package c12.exception_examples;
import jdk.jshell.spi.ExecutionControl;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a double number: ");
            if (!input.hasNextDouble()) {
                throw new InputMismatchException("It isn't a double. You bought an exception");
            } else if (input.hasNextDouble()) {
                throw new RuntimeException("You earned an exception");
            }
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
