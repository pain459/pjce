package c9_revision;

public class TestingPassObject {
    public static void main(String[] args) {
        System.out.println("Testing the pass object demo");
        CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields();
        printAreasChart(c1, 10);

        System.out.println("Program completed. Chart displayed.");
    }

    public static void printAreasChart(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            c.setRadius(times);
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            times--;
        }
    }
}
