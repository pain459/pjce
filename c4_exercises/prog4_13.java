import java.util.Scanner;

public class prog4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vowel or consonant?");
        System.out.print("Enter a letter: ");
        String _input = input.nextLine();
        if (_input.length() != 1) {
            System.out.println("Invalid input. Program will exit now.");
            System.exit(1);
        }
        char _check = _input.charAt(0);
        _check = Character.toUpperCase(_check);
        // _check = _check.toUpperCase();
        if (_check == 'A' || _check == 'E' || _check == 'I' || _check == 'O' || _check == 'U') {
            System.out.println(_check + " is a vowel.");
        } else {
            System.out.println(_check + " is a consonant.");
        }
    }
}
