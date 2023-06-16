package c10.Loan;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        System.out.println("This program will check the string if it is a palindrome " + "\n" +
                "after ignoring the non alphanumeric characters");
    }

    public static boolean isPalindrome (String s) {
        return false;
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
        return "a";
    }

    public static String reverse(String s) {
        return "a";
    }
}
