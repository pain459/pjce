package c1_exercises;

import java.util.Scanner;

public class prog1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int iterations = input.nextInt();
        System.out.println("a   a^2   a^3   a^4");
        int result = 0;
        for (int i = 1; i <= iterations; i++) {
            System.out.println(
                    i + "   " + (int) Math.pow(i, 2) + "     " + (int) Math.pow(i, 3) + "     " + (int) Math.pow(i, 4));
        }
    }
}
