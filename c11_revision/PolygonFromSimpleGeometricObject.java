package c11_revision;

/** Area of a polygon using the formula: A = (L^2 * n)/[4 * tan (180/n)]
 * Where, A = area of the polygon,
 * L = Length of the side
 * n = Number of sides of the given polygon.*/
public class PolygonFromSimpleGeometricObject extends SimpleGeometricObject{
    private double lengthOfASide;
//    private double radius;
    private int numberOfSides;

    public PolygonFromSimpleGeometricObject() {}

    public PolygonFromSimpleGeometricObject(double lengthOfASide, int numberOfSides) {
        this.lengthOfASide = lengthOfASide;
//        this.radius = radius;
        this.numberOfSides = numberOfSides;
    }

    public PolygonFromSimpleGeometricObject(double lengthOfASide, int numberOfSides, String color, boolean filled) {
        this.lengthOfASide = lengthOfASide;
        this.numberOfSides = numberOfSides;
        setColor(color);
        setFilled(filled);
    }

    public double getArea() {
        return ((Math.pow(lengthOfASide, 2) * numberOfSides) / (4 * Math.tan((double) 180 / numberOfSides)));
    }
}
