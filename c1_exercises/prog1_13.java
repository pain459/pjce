package c1_exercises;
import java.util.Scanner;
public class prog1_13 {
    public static void main(String[] args) {
        System.out.println("This program will solve for x and y using cramers rule.");
        Scanner input = new Scanner(System.in);
        // double a, b, c, d, e, f = 0;
        System.out.println("Enter first equation in spaces:");
        System.out.print("x * ? + y * ? = ?: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double e = input.nextDouble();
        System.out.println("Enter second equation in spaces:");
        System.out.print("x * ? + y * ? = ?: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        double f = input.nextDouble();
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("Calculated x is: " + x);
        System.out.println("Calculated y is: " + y);
    }
}
