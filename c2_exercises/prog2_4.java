package c2_exercises;
import java.util.Scanner;
public class prog2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number in square meters: ");
        double sqmeters = input.nextDouble();
        System.out.printf(sqmeters + " square meters is %.3f pings \n ", sqmeters * 0.3025);
    }
}
