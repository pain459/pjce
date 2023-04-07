package c1_exercises;
import java.util.Scanner;
public class prog1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("Calculated perimeter is " + 2 * Math.PI * radius);
        System.out.println("Calculated area is " + (Math.PI * Math.pow(radius, 2)));
    }
}
