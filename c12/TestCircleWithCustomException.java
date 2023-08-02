package c12;

import c9_revision.CircleWithPrivateDataFields;

public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(0);
            new CircleWithCustomException(-5);
        } catch (InvalidRadiusException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects() );
    }
}

class CircleWithCustomException {
    /** The radius is the circle */
    private double radius;

    /** The number of the objects created */
    private static int numberOfObjects = 0;

    /** Construct the circle with radius 1 */
    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    /** Construct a circle with a specified radius */
    public CircleWithCustomException (double newRadius) throws InvalidRadiusException{
        setRadius(newRadius);
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new InvalidRadiusException(newRadius);
        }
    }

    /** Return number of objects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    public double findArea() {
        return radius * radius * Math.PI;
    }
}
