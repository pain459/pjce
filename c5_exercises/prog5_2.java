import java.util.*;
public class prog5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Repeat multiplications");
        int correctAnswers = 0, totalQuestions = 0;
        long startTime = System.currentTimeMillis();
        try {
            while (totalQuestions < 5) {
            int _x = (int) (Math.random() * 100) % 13;
            int _y = (int) (Math.random() * 100) % 13;
            System.out.print("What is " + _x + " x " + _y + ": ");
            int _result = input.nextInt();
            if (_result == _x * _y) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. Correct answer is " + _x * _y);
            }
            totalQuestions++;
            }
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;
            System.out.println("You scored " + correctAnswers + " out of " + totalQuestions);
            System.out.println("Total test time is " + testTime/1000 + " seconds");
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input identified!");
        }
    }
}
