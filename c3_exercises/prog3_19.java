import java.util.Scanner;

public class prog3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate the perimeter of the triangle");
        System.out.print("Enter points x1, y1, x2, y2, x3, y3 with spaces: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        // validation of entries starts here.
        if ((x1 + y1 + x2 + y2 > x3 + y3) && (x2 + y2 + x3 + y3 > x1 + x2) && (x3 + y3 + x1 + y1 > x2 + y2)) {
            System.out.println("Entered points are valid.");
        } else {
            System.out.println("Entered points are invalid. Program exits now.");
            System.exit(1);
        }
        double x = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double y = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double z = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double _perimeter = x + y + z;
        System.out.printf("Perimeter of the given triangle is %.3f\n ", _perimeter);
    }
}
