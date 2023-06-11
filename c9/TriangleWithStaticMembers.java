public class TriangleWithStaticMembers {
    /* The side of a triangle */
    double side;
    /* The number of objects created */
    static int numberOfObjects = 0;
    /* Construct a triangle with side 1 and increment the objects */
    TriangleWithStaticMembers() {
        side = 1;
        numberOfObjects++;
    }

    /* Construct a triangle with specified side */
    TriangleWithStaticMembers(double newSide) {
        side = newSide;
        numberOfObjects++;
    }

    /* Return the number of objects */
    static int returnNumberOfObjects() {
        return numberOfObjects;
    }

    /* Return the area of equilateral triangle */
    double getAreaOfTriangle() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }
}
