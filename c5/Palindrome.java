package c5;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        // Initiation of scanner and storing the input.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string to check if it is a palindrome: ");
        String s = input.nextLine();
        // Marking index of first character and last character
        int low = 0;
        int high = s.length() - 1;
        // logic
        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        // deciding
        if (isPalindrome) {
            System.out.println(s + " is a palindrome.");
        }
        else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}
