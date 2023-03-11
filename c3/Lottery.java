import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // initiate scanner
        Scanner input = new Scanner(System.in);

        // Generate lottery number
        int lottery = (int) (Math.random() * 100);
        // int lottery = 2;
        if (lottery < 10) {
            lottery = lottery * 10;
        }
        // System.out.println("Lottery number is " + lottery);

        // Declaring prices
        final int prize_1 = 10000;
        final int prize_2 = 3000;
        final int prize_3 = 1500; 

        // promt the user to enter a guess
        System.out.print("Enter you lottery pick (positive a and should be 2 digits): ");
        int user_pick = input.nextInt();
        if ((user_pick > 99) || (user_pick < 10)) {
            System.out.println("Invalid entry. Program will now exit.");
            System.exit(1);
        }

        // validation for a correct bid.
        if (user_pick < 10) {
            System.out.println("Invalid bid. Program exits now.");
            System.exit(1);
        }

        // get digits from lottery
        int lottery_digit_1 = lottery / 10;
        int lottery_digit_2 = lottery % 10;

        // get digits from user input
        int user_pick_digit_1 = user_pick / 10;
        int user_pick_digit_2 = user_pick % 10;

        // printing actual lottery number.
        System.out.println("Lottery number is " + lottery);

        // Check the guess and reward.
        if (lottery == user_pick) {
            System.out.println("Contragulations! You wont the jackpot of $" + prize_1);
        }
        else if ((lottery_digit_1 == user_pick_digit_2) && (lottery_digit_2 == user_pick_digit_1)) {
            System.out.println("Congratulations! You won the match digits prize of $" + prize_2);
        }
        else if ((lottery_digit_1 == user_pick_digit_1) || (lottery_digit_1 == user_pick_digit_2) || (lottery_digit_2 == user_pick_digit_1) || (lottery_digit_2 == user_pick_digit_2)) {
            System.out.println("Congratulations! You won the prize of matching atleast 1 digit of $" + prize_3);
        }
        else {
            System.out.println("Hard luck! You didn't win any prize!");
        }
    }
}
