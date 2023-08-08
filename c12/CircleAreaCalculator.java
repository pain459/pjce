package c12;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UnknownFormatConversionException;

public class CircleAreaCalculator {
    public static void getArea(double radius) {
        if(radius > 0) {
            double area =  Math.PI * radius * radius;
            System.out.println("Area of a circle with radius " + radius + " is " + area);
        } else if (radius == 0) {
            throw new InputMismatchException("Caught the junk value.");
        } else if (radius < 0) {
            throw new UnsupportedOperationException("Nope! That's not a circle type data.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        try {
            getArea(radius);
        } catch (InputMismatchException ex) {
            System.out.println("Exception caught.");
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex);
        }
        System.out.println("Program completed.");
    }
}
