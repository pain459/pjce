import java.util.Scanner;
public class prog3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double _a1 = input.nextDouble();
        double _b1 = input.nextDouble();
        // our circle is centered at (1,1) with radius 10
        double _a0 = 1, _b0 = 1;
        double _distance = 10;
        double _calc = Math.sqrt(Math.pow(_a1 - _a0, 2) + Math.pow(_b1 - _b0, 2));
        if (_calc < _distance) {
            System.out.println("Point (" + _a1 + ", " + _b1 + ") is inside the circle");
        } else if (_calc == _distance) {
            System.out.println("Point (" + _a1 + ", " + _b1 + ") is on the circle");
        } else {
            System.out.println("Point (" + _a1 + ", " + _b1 + ") is outside the circle");
        }
    }
}
