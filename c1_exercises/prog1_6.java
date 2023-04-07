package c1_exercises;

import java.util.Scanner;

public class prog1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the max number for series addition: ");
        int m = input.nextInt();

        int result = m * (m + 1) / 2;
        System.out.println("Result is: " + result);
    }
}