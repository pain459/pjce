public class TestSimpleRectangle {
    public static void main(String[] args) {
        System.out.println("Single file based class to define a rectangle and give its area.");
        SimpleRectangle sr1 = new SimpleRectangle();
        System.out.println("sr1 details are length " + sr1.length + " breadth " + sr1.breadth);

        SimpleRectangle sr2 = new SimpleRectangle(10, 20);
        System.out.println("sr2 details are length " + sr2.length + " breadth " + sr2.breadth);

        System.out.println("Perimeter of sr1 is " + sr1.perimeter());
        System.out.println("Perimeter of sr1 is " + sr2.perimeter());
        sr1.setLengthBreadth(100, 200);
        sr2.setLengthBreadth(200, 400);
        System.out.println("After changing the length and breadth of the rectangle.");
        System.out.println("New Perimeter of sr1 is " + sr1.perimeter());
        System.out.println("New Perimeter of sr1 is " + sr2.perimeter());

    }
}

/** Class */
class SimpleRectangle {
    /** Data fields */
    double length = 2, breadth = 1;
    /** Constructors */
    SimpleRectangle() {
    }

    SimpleRectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double perimeter() {
        double p = 2 * (length + breadth);
        return p;
    }

    void setLengthBreadth(double l, double b) {
        length = l;
        breadth = b;
    }
}
