package lib_local;

import java.util.ArrayList;
import java.util.Scanner;

public class captureInput {
    // scanner: practically no limit on inputs and exits at negative number.
    public static int[] captureInputNegativeExit() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num < 0) {
                break;
            } else {
                userInput.add(num);
            }
        }
        int[] returnedArray = userInput.stream().mapToInt(i -> i).toArray(); // Convert arraylist to array and return it
                                                                             // from the method.
        return returnedArray;
    }

    public static int[] captureInputZeroExit() {
        System.out.println("(Enter 0 to exit) ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            } else {
                userInput.add(num);
            }
        }
        int[] returnedArray = userInput.stream().mapToInt(i -> i).toArray(); // Convert arraylist to array and return it
                                                                             // from the method.
        return returnedArray;
    }
}
