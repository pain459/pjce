package encapsulation;

public class CircleWithPrivateDataFields {
    /* The radius of the circle */
    private double radius = 1;

    /* Number of objects created */
    private static int numberOfObjects = 0;

    /* Construct a circle with radius 1 */
    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    /* Construct circle with a specific radius */
    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /* Return Radius */
    public double getRadius() {
        return radius;
    }

    /* Set Radius */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /* Return the number of objects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /* Return the area of the circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }

}
