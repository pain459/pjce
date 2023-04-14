import java.util.Scanner;
import java.lang.Math;
public class prog4_2 {
    public static void main(String[] args) {
        final double _radius = 6371.01;
        System.out.println("Geometry: great circle distance");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double _x1 = input.nextDouble();
        double _y1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double _x2 = input.nextDouble();
        double _y2 = input.nextDouble();
        // converting degrees to radians
        _x1 = Math.toRadians(_x1);
        _y1 = Math.toRadians(_y1);
        _x2 = Math.toRadians(_x2);
        _y2 = Math.toRadians(_y2);
        // calculating the distance
        double _d = _radius * Math.acos(Math.sin(_x1) * Math.sin(_x2) + Math.cos(_x1) * Math.cos(_x2) * Math.cos(_y1 - _y2));
        System.out.println("The distance between the two points is " + _d + " km");
    }
}
