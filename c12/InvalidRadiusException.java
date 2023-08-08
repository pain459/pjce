package c12;

public class InvalidRadiusException extends Exception{
    private double radius;
    /** Construct an exception */
    public InvalidRadiusException(double radius){
        super("Invalid Radius " + radius);
        this.radius = radius;
    }
    /** Return the radius */
    public double getRadius() {
        return radius;
    }
}
