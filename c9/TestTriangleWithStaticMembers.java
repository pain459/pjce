public class TestTriangleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before Creating Objects.");
        System.out.println("The number of triangle objects is " + TriangleWithStaticMembers.numberOfObjects);

        // Create a triangle with side 10
        TriangleWithStaticMembers tr1 = new TriangleWithStaticMembers();
        // Displaying data of tr1 before tr2 is created.
        System.out.println("Number of objects in tr1: " + tr1.returnNumberOfObjects());
        System.out.println("Area of tr1 is: " + tr1.getAreaOfTriangle());
        // create tr2
        TriangleWithStaticMembers tr2 = new TriangleWithStaticMembers(15);
        // Displaying data of tr1 and tr2 after tr2 is created.
        System.out.println("New number of objects in tr1: " + tr1.returnNumberOfObjects());
        System.out.println("Area of tr1 is: " + tr1.getAreaOfTriangle());
        System.out.println("Number of objects in tr2: " + tr2.returnNumberOfObjects());
        System.out.println("Area of tr2 is: " + tr2.getAreaOfTriangle());

        if (tr1.returnNumberOfObjects() == tr2.returnNumberOfObjects()) {
            System.out.println("Static membsership verified.");
        }
    }
}
