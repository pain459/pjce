import java.util.Scanner;

public class prog6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check password");
        // System.out.println(checkPassword("Pass@1123"));
        System.out.print("Enter the password to validate: ");
        String _input = input.next();
        checkPassword(_input);
        // checkPassword("Pass@123");
    }

    public static void checkPassword(String n) {
        int totalCharacters = 0, digits = 0, alphabets = 0; // using some garbage here. But could be useful later.
        boolean onlyLettersDigits = false, exitLoop = false;
        // for (char c : n.toCharArray()) {
        // System.out.println(c);
        // }
        while (!onlyLettersDigits && !exitLoop) {
            if (n.length() >= 8) {
                for (char c : n.toCharArray()) {
                    if (Character.isAlphabetic(c)) {
                        alphabets++;
                    } else if (Character.isDigit(c)) {
                        digits++;
                    } else if (!Character.isLetterOrDigit(c)) {
                        onlyLettersDigits = false;
                        System.out.println("Invalid Password");
                        System.exit(1);
                    }
                }
            } else {
                exitLoop = true;
                System.out.println("Invalid Password");
            }
            exitLoop = true;
        }
        if (!onlyLettersDigits && digits >= 3) {
            System.out.println("Valid Password");
        }
    }
}
