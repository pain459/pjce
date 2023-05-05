import java.util.Scanner;
public class MyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The MyTriangle Class");
        System.out.println("Enter 3 sides of a triangle (int only): ");
        int _s1 = input.nextInt();
        int _s2 = input.nextInt();
        int _s3 = input.nextInt();
        System.out.println("Is this a valid triangle? " + isValid(_s1, _s2, _s3));
        if (isValid(_s1, _s2, _s3)) {
            System.out.println("Area of the triangle is: " + area(_s1, _s2, _s3));
        }

    }
    /* Return true of sum of any two sides is greater than the third side */
    public static boolean isValid (double side1, double side2, double side3) {
        if (side1 == 0 || side2 == 0 || side3 == 0) {
            return false;
        }
        if (side1 + side2 >= side3) {
            return true;
        } else if (side2 + side3 >= side1){
            return true;
        } else if (side3 + side1 >= side2) {
            return true;
        } else {
            return false;
        }
    }

    public static double area (double side1, double side2, double side3) {
        // double _area = 0;
        if (isValid(side1, side2, side3)) {
            double _s = (side1 + side2 + side3) / 2;
            double _area = Math.sqrt((_s * (_s - side1)) * (_s - side2) * (_s - side3));
            return _area;
        } else {
            return -1;
        }       
    }
}


// double _s = (_s1 + _s2 + _s3) / 2;
// double _area = Math.sqrt((_s * (_s - _s1)) * (_s - _s2) * (_s - _s3));