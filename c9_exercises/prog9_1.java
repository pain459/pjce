package c9_exercises;

/**
 * author: pain
 */
public class prog9_1 {
    /** main class */
    public static void main(String[] args) {
        System.out.println("This is a rectangle class demo.");
        rectangle r1 = new rectangle();
        System.out.println("Area of default rectangle: " + r1.getArea());
        System.out.println("Perimeter of default rectangle: " + r1.getPerimeter());
        rectangle r2 = new rectangle(3.5, 6.8);
        System.out.println("Area of custom given rectangle: " + r2.getArea());
        System.out.println("Perimeter of custom given rectangle: " + r2.getPerimeter());
    }
}

class rectangle {
    static double width = 1;
    static double height = 1;

    // constructor
    rectangle() {
    }
    // constructor to override defaults.
    rectangle(double newWidth, double newHeight) {
        width = (newWidth > 0) ? newWidth : width;
        height = (newHeight > 0) ? newHeight : height;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}
