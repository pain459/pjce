import java.util.Scanner;

public class AdditionQuiz{
    public static void main(String[] args){
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);

        // create scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + " ? ");

        int answer = input.nextInt();

        System.out.println("Your answer for " + number1 + " + " + number2 + " is " + (number1 + number2 == answer));

    }
}