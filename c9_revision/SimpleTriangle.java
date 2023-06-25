package c9_revision;

public class SimpleTriangle {
    public static void main(String[] args) {
        System.out.println("Testing the triangle class as a combined class in java.");
        // Creating a triangle with triangle class
        SimpleTriangle triangle = new SimpleTriangle();
        System.out.println(triangle.side1 + ", " + triangle.side2 + ", " + triangle.side3);
//        Triangle triangle1 = new Triangle(1, -2, 3); // program should exit here based on the rules.
//        System.out.println(triangle1.side1 + ", " + triangle1.side2 + ", " + triangle1.side3);
        System.out.println("Area of triangle with sides " + triangle.side1 + ", " + triangle.side2 + ", " + triangle.side3 +
                " is " + triangle.getArea());
        // Creating a new triangle with custom sides.
        SimpleTriangle triangle1 = new SimpleTriangle(2, 3, 4);
        System.out.println(triangle1.side1 + ", " + triangle1.side2 + ", " + triangle1.side3);
        System.out.println("Area of triangle with sides " + triangle1.side1 + ", " + triangle1.side2 + ", " + triangle1.side3 +
                " is " + triangle1.getArea());
        System.out.println("Perimeter of triangle with sides " + triangle1.side1 + ", " + triangle1.side2 + ", " + triangle1.side3 +
                " is " + triangle1.getPerimeter());

    }

    double side1;
    double side2;
    double side3;
    /** Construct a triangle with radius as 1 on all the sides */
    SimpleTriangle() {
        side1 = side2 = side3 = 1;
    }

    /**
     * Construct triangle with fixed sides
     */
    SimpleTriangle(double s1, double s2, double s3) {
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            throw new IllegalArgumentException("Incorrect sides provided. Class not created");
        } else if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) {
            throw new IllegalArgumentException("Sum of two sides is greater than third side. Class not created.");
        } else {
            side1 = s1;
            side2 = s2;
            side3 = s3;
        }
    }

    /**
     * Return the area of a triangle
     */
    double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Return the perimeter of the triangle
     */
    double getPerimeter() {
        return side1 + side2 + side3;
    }
}