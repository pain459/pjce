import java.util.Arrays;

import lib_local.arrayOperations;
import lib_local.*;

public class prog7_18 {
    public static void main(String[] args) {
        System.out.println("Bubble sort algorithm implementation.");
        System.out.println("Enter 10 integers: ");
        // int[] userInput = captureInput.captureArrayOfSizeInt(10);
        // System.out.println(Arrays.toString(userInput));
        int[] userInput = { 5, 9, 3, 1, 2, 8, 4, 7, 6 };
        int[] sortedArray = arrayOperations.performBubbleSortInt(userInput);
        System.out.println(Arrays.toString(sortedArray));
        // arrayOperations.performBubbleSortInt(userInput);
    }
}
