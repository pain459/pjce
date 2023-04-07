package c2_exercises;

import java.util.Scanner;

public class prog2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int _number = input.nextInt();
        int lastPlace = _number % 10;
        int middlePlace = _number / 10 % 10;
        int firstPlace = _number / 10 / 10;
        System.out.println(
                "The multiplication of all digits in " + _number + " is " + lastPlace * middlePlace * firstPlace);
    }
}
