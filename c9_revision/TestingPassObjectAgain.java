package c9_revision;

public class TestingPassObjectAgain {
    public static void main(String[] args) {
        CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields();
        PrintModifiers(c1);
    }

    public static void PrintModifiers(CircleWithPrivateDataFields c) {
        System.out.println("Printing modified values");
        System.out.println("Setting radius of this circle as 121");
        c.setRadius(121);
        System.out.println("Area of this circle is " + c.getArea());
    }
}
