import java.util.Scanner;
public class prog3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double _x1 = 1.0, _y1 = 1.0; // center of the rectangle
        final double _w = 10.0, _h = 5.0; // width and height
        System.out.print("Enter a point with two co-ordinates: ");
        double _x2 = input.nextDouble();
        double _y2 = input.nextDouble();
        double _distance = Math.sqrt(Math.pow(_x2 - _x1, 2) + Math.pow(_y2 - _y1, 2));

        if (_distance < _w / 2 && _distance < _h / 2) {
            System.out.println("Point (" + _x2 + ", " + _y2 + ") is inside the rectangle");
        } else if (_distance == _w / 2 && _distance == _h / 2) {
            System.out.println("Point (" + _x2 + ", " + _y2 + ") is on the rectangle");
        } else {
            System.out.println("Point (" + _x2 + ", " + _y2 + ") is outside the rectangle");
        }
    }
}
