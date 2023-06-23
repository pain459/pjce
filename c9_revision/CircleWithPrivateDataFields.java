package c9_revision;

public class CircleWithPrivateDataFields {
    /** The radius of the circle */
    private double radius = 1; // encapsulated radius.
    /** The number of objects created */
    private static int numberOfObjects = 0; // encapsulated numberOfObjects
    /** Construct a circle with radius 1 */
    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }
    /** Construct a circle with specified radius */
    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    /** Return radius */
    public double getRadius() {
        return radius;
    }
    /** Set new radius */
    public void setRadius(double newRadius) {
        radius = (radius >= 0) ? newRadius : radius;
    }
    /** Return numberOfObjects */
    public int getNumberOfObjects() {
        return numberOfObjects;
    }
    /** Return the area of this circle */
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
