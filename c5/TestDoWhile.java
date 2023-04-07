package c5;
import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int data;
        // Keep reading the input until the condition is met.
        do {
            System.out.print("Enter the number to add into sum: (Entry 0 ends the program): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("Sum is " + sum);
    }
}
