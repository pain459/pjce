import lib_local.*;

import java.util.Arrays;
import java.util.Scanner;

public class prog7_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Single number counter.");
        System.out.println("Enter the range of array needed: ");
        int range = input.nextInt();
        int[] generatedArray = integerGenerator.generateIntegerArray(range);
        System.out.println(Arrays.toString(generatedArray));
        int[] stencilArray = counters.stencilArray(0, 9);
        int[] counterArray = counters.integerCounter(generatedArray, 0, 9);
        for (int i : stencilArray) {
            System.out.println(stencilArray[i] + " appeared " + counterArray[i] + " times.");
        }
    }
}
