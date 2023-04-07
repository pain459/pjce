package c2_exercises;
import java.util.Scanner;
public class prog2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value in meters: ");
        double meters = input.nextDouble();
        System.out.printf(meters + " meters is %.3f feet \n ", meters * 3.2786);
    }
}
