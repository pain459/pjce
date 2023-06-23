package c9_revision;

public class TestCircleWithPrivateDataFields {
    /** Main method */
    public static void main(String[] args) {
        // create circle with radius 5
        CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields();
        System.out.println(c1.getNumberOfObjects());
        CircleWithPrivateDataFields c2 = new CircleWithPrivateDataFields(10);
        System.out.println(c2.getNumberOfObjects());
        System.out.println(c1.toString());
    }
}
