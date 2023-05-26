public class TestSimpleCircle {
    // Main method
    public static void main(String[] args) {
        // main class
        // Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());

    }    
}

// define a circle class with 2 constructors
class SimpleCircle {
    double radius;  // declaring the variable radius

    /**Construct a circle with radius 1 */
    SimpleCircle() {
        radius = 1;
    }

    /**Construct a circle with specific radius */
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    /**Return the area of the circle */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /**Return the perimenter of the circle */
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**Set a new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
    }

}
