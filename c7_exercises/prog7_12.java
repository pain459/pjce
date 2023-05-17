import java.util.Arrays;

import lib_local.arrayOperations;

public class prog7_12 {
    public static void main(String[] args) {
        System.out.println("Reverse an array.");
        double[] testArray = {1, 2, 3, 4};
        double[] reversedArray = arrayOperations.reverseArray(testArray);
        System.out.println("Reversed array is " + Arrays.toString(reversedArray));
    }
}
