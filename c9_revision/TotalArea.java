package c9_revision;

public class TotalArea {
    // Main method
    public static void main(String[] args) {
        // Declare circleArray
        CircleWithPrivateDataFields[] circleArray;

        // Create circleArray
        circleArray = createCircleArray();

        //  Print circleArray and total areas of the circles
        printCircleArray(circleArray);

    }

    /** Create an array of circle objects */
    public static CircleWithPrivateDataFields[] createCircleArray() {
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
        }
        return circleArray;
    }

    /** Print an array of circles and their total area */
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        System.out.printf("%-30s%-15s\n", "------", "----");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("------------------------------------------------\n");
    }

    /** Add all circle areas */
}

