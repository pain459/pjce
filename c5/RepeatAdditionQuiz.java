package c5;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        
        // initiate scanner
        Scanner input = new Scanner(System.in);
        
        // generate 2 numbers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // ask the question and capture the answer
        System.out.print("What is " + number1 + " + " + number2 + " ? ");
        int result = input.nextInt();

        // evaluate the answer and loop through until correct.
        while (number1 + number2 != result) {
            System.out.println("Wrong answer! Please try again.");
            System.out.print("What is " + number1 + " + " + number2 + " ? ");
            result = input.nextInt();
        }

        System.out.println("You got it!");

    }
}
