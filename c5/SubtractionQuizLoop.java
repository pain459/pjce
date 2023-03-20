package c5;
import java.util.Scanner;
public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;  // total number of questions
        int correctCount = 0;  // counting correct number of questions
        int count = 0;  // counting questions placed
        long startTime = System.currentTimeMillis();  // timer starts here
        String output = " "; // Output scanner is initially empty 
        Scanner input = new Scanner(System.in); // scanner initializes here

        while (count < NUMBER_OF_QUESTIONS) {
            // generate two random single digit integers
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            // if number1 < number2 swap the numbers
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // prompt the student to answer the question
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct");
                correctCount++; // increase the correct answer count
            }

            else {
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
            }
            // Increase the question count
            count++;
            // Using string concat to store the final answer and output.
            output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = (endTime - startTime) / 1000;

        System.out.println("Test time is " + testTime + " seconds" + output);
    }
}
