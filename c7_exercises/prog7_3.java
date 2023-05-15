import java.util.ArrayList;
import java.util.Scanner;

public class prog7_3 {
    public static void main(String[] args) {
        System.out.println("Count occurence of numbers");
        System.out.print("Enter the integers between 1 and 50: ");
        int[] userInput = captureInput(); // invocation for to take user input and return the array.
        // int[] testarray = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9 };
        repeatChecker(userInput); // feeder to check the repeated input.
    }

    /** capturing user input in form of a method */
    public static int[] captureInput() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            } else if (num > 50) {
                System.out.println("Entered value above 50. Program exits now.");
                System.exit(1);
                // break;
            } else {
                userInput.add(num);
            }
        }
        int[] returnedArray = userInput.stream().mapToInt(i -> i).toArray(); // Convert arraylist to array and return it from the method.
        return returnedArray;
    }

    public static void repeatChecker(int[] arrayToCheck) {
        int count = 0;
        // int[] cloneArray = new int[arrayToCheck.length];
        // System.arraycopy(arrayToCheck, 0, cloneArray, 0, arrayToCheck.length);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // ArrayList<Integer> list2 = new ArrayList<Integer>();
        int _temp1 = 0;
        for (int i = 0; i < arrayToCheck.length; i++) {
            _temp1 = arrayToCheck[i];
            // list1.add(arrayToCheck[i]);
            if (!list1.contains(arrayToCheck[i])) {
                for (int j = 0; j < arrayToCheck.length; j++) {
                    count += (_temp1 == arrayToCheck[j] ? 1 : 0);
                }
                if (count > 1) {
                    System.out.println(_temp1 + " occurs " + count + " times.");
                } else {
                    System.out.println(_temp1 + " occurs " + count + " time.");
                }
            }
            // _temp2 = _temp1;
            list1.add(arrayToCheck[i]);
            count = 0;
        }
    }
}
