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

    public double getInRadius() {
        double a = lengthOfASide;
        int n = numberOfSides;
//        return ((a / 2) * Math.atan(Math.PI / n));
        return (((double)1 / 2) * a * (1 / Math.tan(Math.PI/n)));

    }

    public double getSideLength() {
        int n = numberOfSides;
        double r = getInRadius();
        return (int)(2 * r * Math.tan(Math.PI / n));
    }

    public double getCircumRadius() {
        double a = getSideLength();
        int n = numberOfSides;
        return (double) 1 / 2 * a * 1 / Math.sin(Math.PI / n);
    }
    public double getArea() {
        int n = numberOfSides;
        double r = getInRadius();
        return n * Math.pow(r, 2) * Math.tan(Math.PI / n);
    }

    public double getPerimeter() {
        int n = numberOfSides;
        double a = getSideLength();
        return n * a;
    }

    public double getInteriorAngleX() {
        int n = numberOfSides;
        return (((double) (n - 2) / n) * 180) ;
    }

    public double getExteriorAngleY() {
        int n = numberOfSides;
        return (double) 360 / n;
    }
}
