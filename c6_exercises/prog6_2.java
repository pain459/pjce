import java.util.Scanner;

public class prog6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiply the digis in an integer");
        System.out.print("Enter an integer to multiply digits: ");
        long userInput = input.nextLong();
        System.out.println(mulDigits(userInput));

    }

    public static int mulDigits(long n) {
        long _result = 1;
        while (n != 0) {
            _result *= n % 10;
            n = n / 10;
        }
        return (int) _result;
    }
}
