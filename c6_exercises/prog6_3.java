import java.util.Scanner;

public class prog6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int _dummy = 12345;
        System.out.println("Palindrome Integer");
        System.out.print("Enter the integer to be tested: ");
        Integer userInput = input.nextInt();
        System.out.println("Reversed number is: " + reverse(userInput));
        System.out.println("Is this number a palindrome? " + isPalindrome(userInput));

    }

    public static int reverse(int number) {
        // String _rev = String.valueOf(number);
        String _reverse = "";
        while (number != 0) {
            _reverse += String.valueOf(number % 10);
            number = number / 10;
        }
        return Integer.valueOf(_reverse);
    }

    public static boolean isPalindrome(int number) {
        if (number == reverse(number)) {
            return true;
        } else {
            return false;
        }
    }
}
