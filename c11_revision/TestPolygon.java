package c11_revision;

public class TestPolygon {
    public static void main(String[] args) {
        PolygonFromSimpleGeometricObject polygon1 = new PolygonFromSimpleGeometricObject(12, 5, "Pink", true);
        System.out.println(polygon1.toString());
        System.out.println("The circle inradius of given polygon is " + polygon1.getInRadius());
        System.out.println("The side length calculated is " + polygon1.getSideLength());
        System.out.println("The circulradius calculated is " + polygon1.getCircumRadius());
        System.out.println("The area of provided polygon is " + polygon1.getArea());
        System.out.println("The calculated perimeter is " + polygon1.getPerimeter());
        System.out.println("Interior angle x is " + polygon1.getInteriorAngleX());
        System.out.println("Exterior angle y is " + polygon1.getExteriorAngleY());
    }
}
