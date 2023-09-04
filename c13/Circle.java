package c13;

public class Circle extends GeometricObject{
    private double radius;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** Return area */
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    /** Return diameter*/
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter*/
    public double getPerimeter() {
        return getDiameter() * Math.PI;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println("The Circle is created " + getDateCreated() + " and the radius is " + getRadius());
    }
}
