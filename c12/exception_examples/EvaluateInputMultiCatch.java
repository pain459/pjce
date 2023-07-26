package c12.exception_examples;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EvaluateInputMultiCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Int number: ");
        try {
            int i = input.nextInt();
            if (i <= 10) {
                throw new ArithmeticException();
            } else {
                System.out.println("No exceptions observed.");
            }
        } catch (InputMismatchException | ArithmeticException ex) {
            System.out.println("Caught exception");
        }
    }
}
