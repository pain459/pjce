package c11.SGOL;

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        System.out.println("One more demo of polymorphism");
        displayobjectdemo(new CircleFromSimpleGeometricObject(1, "red", true));
    }

    public static void displayobjectdemo (SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}


