package c4;
import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        // initiate scanner
        Scanner input = new Scanner(System.in);

        // generate lottery numbers as string
        String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        System.out.println(lottery);

        // Take user input
        System.out.print("Enter your lottery guess (two digits only):  ");
        String guess = input.nextLine();

        // verify the guess if it is per game rules
        if (guess.length() > 2) {
            System.out.println("Game rules not followed. Entered more than 2 digits. Game will exit now.");
            System.exit(1);
        }

        // get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);
        // get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);
        // check the guess and print the results

        if (guess.equals(lottery)) {
            System.out.println("Exact match. You won $10000.");
        }
        else if ((guessDigit2 == lotteryDigit1) && (guessDigit1 == lotteryDigit2)) {
            System.out.println("Match all digits. You won $3000.");
        }
        else if (guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit. You won $1000.");
        }
        else {
            System.out.println("Sorry, no match. You lost!");
        }
    }
}
