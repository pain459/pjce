import java.util.Arrays;
import java.util.Scanner;

import lib_local.arrayOperations;
import lib_local.captureInput;

public class prog7_20 {
    public static void main(String[] args) {
        System.out.println("Reverse relection sort.");
        System.out.println("Enter 10 integers: ");
        int[] userInput = captureInput.captureArrayOfSizeInt(10);
        // int[] testArray = {3, 4, 5, 2, 1};
        System.out.print("After performing reverse selection sort: ");
        System.out.println(Arrays.toString(arrayOperations.performReverseSelectionSortInt(userInput)));
    }
}
