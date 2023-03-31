package c1_exercises;
import java.util.Scanner;
public class prog1_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate the area and perimeter of the rectangle");
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = input.nextDouble();

        System.out.println("Area of the given rectangle is: " + width * height);
        System.out.println("Perimeter of the given rectangle is: " + 2 * (width + height));
    }   
}
