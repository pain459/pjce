package c11_revision;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius; // defaulting to 0

    public CircleFromSimpleGeometricObject() {}

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return Radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return Perimeter */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /** print the circle info */
    public void printCircle() {
        System.out.println("The circle is created on " + getDateCreated() +
                " and the radius is " + radius);
    }
}
