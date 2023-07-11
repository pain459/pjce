package c11_revision;

public class SimpleGeometricObject {
    private String color = "White";
    private boolean filled;  // default is false.
    private java.util.Date dateCreated; // creation date.

    /** Construct a default geometry object */
    public SimpleGeometricObject() {
    }

    /** Construct a  geometric object with the specified color and
     * a filled value */
    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled, since filled is boolean */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

}
