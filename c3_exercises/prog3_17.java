import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class prog3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rock Paper Scissors game.");
        System.out.print("Scissor (0), rock (1), paper (2): ");
        int userChoice = input.nextInt();
        int compChoice = ThreadLocalRandom.current().nextInt(0, 2);
        int compWin = 0, userWin = 0;
        if (compChoice == 1 && userChoice == 2) {
            compWin = 1;
            userWin = 0;
            return;
        } else if (compChoice == 1 && userChoice == 0) {
            compWin = 1;
            userWin = 0;
        } else if (compChoice == 2 && userChoice == 1) {
            compWin = 1;
            userWin = 0;
        } else if (userChoice == 1 && compChoice == 2) {
            compWin = 0;
            userWin = 1;
            return;
        } else if (userChoice == 1 && compChoice == 0) {
            compWin = 0;
            userWin = 1;
        } else if (userChoice == 2 && compChoice == 1) {
            compWin = 0;
            userWin = 1;
        } else {
            compWin = userWin = 1;
        }

        if (compWin == 1 && userWin == 0) {
            System.out.println("Computer won.");
        } else if (userWin == 1 && compWin == 0) {
            System.out.println("User won.");
        } else if (userWin == 1 && compWin == 1) {
            System.out.println("Its a draw.");
        }
    }
}
