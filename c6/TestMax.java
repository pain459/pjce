package c6;
import java.util.Scanner;
public class TestMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long num1 = input.nextLong();
        System.out.print("Enter the second number: ");
        long num2 = input.nextLong();

        long max_number = maxNumber(num1, num2);

        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + max_number);
        
    }

    public static long maxNumber(long i1, long i2) {
        long result;
        if (i1 > i2) {
            result = i1;
        }
        else {
            result = i2;
        }

        return result;
    }
}
