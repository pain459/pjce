import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class fakeCasino {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int totalRounds = 5;
        double minimumBet = 50;
        System.out.println("Welcome to the fake casino. House always wins!");
        int[] seedOrder = new int[totalRounds];
        System.out.println("House is cheating. Predefined series below.");
        System.out.print("Enter the seed: ");
        int s1 = userInput.nextInt();
        Random seed = new Random(s1);
        for (int i = 0; i < totalRounds; i++) {
            int _temp = seed.nextInt(10);
            System.out.print(_temp + " ");
            seedOrder[i] = _temp;
        }
        System.out.println(" ");
//        System.out.println(Arrays.toString(seedOrder));

        int userWon = 0;
        int houseWon = 0;
        System.out.println("Game will run for 5 rounds and minimum bet 50.");
        int remainingRounds = totalRounds;
        while (remainingRounds != 0) {
            System.out.println("Enter a number between 0 and 9");
            System.out.print("Enter user bet: ");
            int userBet = userInput.nextInt();
            System.out.print("Enter house bet: ");
            int houseBet = userInput.nextInt();
            System.out.println("Machine generated: " + seedOrder[remainingRounds - 1]);
            if (userBet == seedOrder[remainingRounds - 1]) {
                userWon++;
                System.out.println("User won!");
            } else if (houseBet == seedOrder[remainingRounds - 1]) {
                houseWon++;
                System.out.println("House won!");
            } else {
                System.out.println("Game in gutter. Dumb dealer!");
            }
            remainingRounds--;
        }
        System.out.println("User won " + userWon + " games. Total prize money " + userWon * minimumBet);
        System.out.println("House won " + houseWon + " games. Total prize money " + houseWon * minimumBet);
    }
}
