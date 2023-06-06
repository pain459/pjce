package encapsulation;

public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields(1);
        // print areas for radius 1, 2, 3, 4, 5
        int n = 5;
        printAreas(c1, n);
        // See myCircle.radius and times
        System.out.println("\n" + "Radius is " + c1.getRadius());
        System.out.println("n is " + n);
    }

    public static void printAreas(CircleWithPrivateDataFields c, int times) {
        System.out.println("Radius\t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
