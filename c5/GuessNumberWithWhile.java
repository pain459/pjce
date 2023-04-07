package c5;

import java.util.Scanner;

public class GuessNumberWithWhile {
    public static void main(String[] args) {
        int comp_guess = (int) (Math.random() * 100);
        System.out.println("Computer guess for reference only: " + comp_guess);

        int user_guess = -1;
        while (user_guess != comp_guess) {
            Scanner input = new Scanner(System.in);
            System.out.println("Guess a magic number between 1 to 100: ");
            user_guess = input.nextInt();

            if (user_guess < 0 || user_guess > 100) {
                System.out.println("Incorrect choice entered. Program will exit now.");
                System.exit(1);
            }

            if (user_guess == comp_guess) {
                System.out.println("You got it. You guess is " + user_guess + " and computer guess is " + comp_guess + "!");
            }
            else if (user_guess > comp_guess) {
                System.out.println("Your guess is too high.");
            }
            else {
                System.out.println("Your guess is too low.");
            }
        }     
    }
}
