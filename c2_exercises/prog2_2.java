package c2_exercises;
import java.util.Scanner;
public class prog2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate the area of equilateral triangle.");
        System.out.print("Enter the length of the sides and height of the equilateral triangle: ");
        double side = input.nextDouble();
        double area = Math.sqrt(3) / 4 * Math.pow(side,2);
        double volume = area * side;
        System.out.println("The area is " + area);
        System.out.printf("The area is %.3f\n", area); // Other way to print.
        System.out.format("The area is %.2f\n", area); // One more.
        System.out.printf("The volume is %.3f\n", volume);
    }
}
