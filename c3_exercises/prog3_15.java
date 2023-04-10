import java.util.Scanner;

public class prog3_15 {
    public static void main(String[] args) {
        // initiate scanner
        Scanner input = new Scanner(System.in);
        // Generate lottery number of 3 digits
        int lottery = (int) (Math.random() * 1000);
        if (lottery < 100) {
            lottery = lottery * 100;
        }
        System.out.println("Cheating: " + lottery);
        // Declaring prices
        final int prize_1 = 12000;
        final int prize_2 = 5000;
        final int prize_3 = 2000;
        // promt the user to enter a guess
        System.out.print("Enter you lottery pick (positive a and should be 3 digits): ");
        int user_pick = input.nextInt();
        // if ((user_pick > 999) || (user_pick < 100)) {
        if ((user_pick > 999)) {
            System.out.println("Invalid bid. Program will now exit.");
            System.exit(1);
        }
        // get digits from lottery
        int _temp = 0;
        int lottery_digit_1 = lottery / 100;
        _temp = lottery % 100;
        int lottery_digit_2 = _temp / 10;
        int lottery_digit_3 = _temp % 10;

        // get digits from user input
        _temp = 0;
        int user_pick_digit_1 = user_pick / 100;
        _temp = user_pick % 100;
        int user_pick_digit_2 = _temp / 10;
        int user_pick_digit_3 = _temp % 10;
        // int user_pick_digit_1 = user_pick / 10;
        // int user_pick_digit_2 = user_pick % 10;

        // printing actual lottery number.
        System.out.println("Lottery number is " + lottery);

        // Check the guess and reward.
        if (lottery == user_pick) {
            System.out.println("Congratulations! You wont the jackpot of $" + prize_1);
        } else if (((lottery_digit_1 == user_pick_digit_1) || (lottery_digit_1 == user_pick_digit_2)
                || (lottery_digit_1 == user_pick_digit_3))
                && ((lottery_digit_2 == user_pick_digit_1)
                        || (lottery_digit_2 == user_pick_digit_2) || (lottery_digit_2 == user_pick_digit_3))
                && ((lottery_digit_3 == user_pick_digit_1) || (lottery_digit_3 == user_pick_digit_2)
                        || (lottery_digit_3 == user_pick_digit_3))) {
            System.out.println("Congratulations! You won the match digits prize of $" + prize_2);
        } else if ((lottery_digit_1 == user_pick_digit_1) || (lottery_digit_1 == user_pick_digit_2)
                || (lottery_digit_1 == user_pick_digit_3) || (lottery_digit_2 == user_pick_digit_1)
                || (lottery_digit_2 == user_pick_digit_2) || (lottery_digit_2 == user_pick_digit_3)
                || (lottery_digit_3 == user_pick_digit_1) || (lottery_digit_3 == user_pick_digit_2)
                || (lottery_digit_3 == user_pick_digit_3)) {
            System.out.println("Congratulations! You won the prize of matching atleast 1 digit of $" + prize_3);
        } else {
            System.out.println("Hard luck! You didn't win any prize!");
        }
    }
}
