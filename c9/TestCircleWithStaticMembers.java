public class TestCircleWithStaticMembers {
    /**Main method */
    public static void main(String[] args) {
        System.out.println("Before creating the objects.");
        System.out.println("The number of circle objects is " 
            + CircleWithStaticMembers.numberOfObjects);
        
        // create circle c1 with new constructor
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        // Display c1 before c2 is created.
        System.out.println("After creating circle c1");
        System.out.println("c1: radius (" + c1.radius + ") and circle objects (" + c1.numberOfObjects + ")");

        // Create circle c2 with some radius
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        // modify c1
        c1.radius = 9;

        // Display c1 and c2 after c2 was created
        System.out.println("After creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of circle objects (" + c2.numberOfObjects + ")");
    }
}
