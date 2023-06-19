package c11.SGOL;

public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("This is polymorphism demo.");
        displayObject(new CircleFromSimpleGeometricObject(1, "red", false)); // polymorphic call
        displayObject(new RectangleFromSimpleGeometryObject(1, 1, "black", true)); // polymorphic call
    }

    /** Display geometric object properties */
    public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}


