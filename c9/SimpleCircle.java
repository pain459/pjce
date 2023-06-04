public class SimpleCircle {
    public static void main(String[] args) {
        System.out.println("Demonstration of simple circle program in a single class.");
        SimpleCircle1 circle1 = new SimpleCircle1();
        System.out.println("The area of the circle of radius "
                + circle1.radius + " is " + circle1.getArea());
    }

    double radius;

    SimpleCircle() {
        radius = 1;
    }

    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}