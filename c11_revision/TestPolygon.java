package c11_revision;

public class TestPolygon {
    public static void main(String[] args) {
        PolygonFromSimpleGeometricObject polygon1 = new PolygonFromSimpleGeometricObject(12, 6, "Pink", true);
        System.out.println(polygon1.toString());
        System.out.println("The circle inradius of given polygon is " + polygon1.getInRadius());
        System.out.println("The area of provided polygon is: " + polygon1.getArea());
    }
}
