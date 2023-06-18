package c10.Loan;
import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        System.out.println("This program will check the string if it is a palindrome " + "\n" +
                "after ignoring the non alphanumeric characters");
        Scanner input = new Scanner(System.in);

        // prompt the user to enter a string
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        // Display result
        System.out.println("Ignoring alphanumeric characters, \nis "
         + s + " a palindrome? " + isPalindrome(s));
    }

    /** Return true if a string is a palindrome */
    public static boolean isPalindrome (String s) {
        // Create a new string by eliminating nonalphanumeric chars
        String s1 = filter(s);

        // Create a new string that is a reversal of s
        String s2 = reverse(s1);

        // Check if the reversal is the same as the original string
        return s2.equals(s1);
    }

    /** Create a new string by eliminating non-alphanumeric chars */
    public static String filter (String s) {
        // Create a string builder
        StringBuilder stringBuilder = new StringBuilder();

        // Examine each char in the string to skip alphanumeric char
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        // Return a new filtered string
        return stringBuilder.toString();
    }

    /** Create a new string by reversing a specified string */
    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse(); // Invoke reverse in StringBuilder
        return stringBuilder.toString();
    }
}
