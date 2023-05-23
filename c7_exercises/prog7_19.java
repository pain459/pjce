import java.util.Arrays;

import lib_local.arrayOperations;

public class prog7_19 {
    public static void main(String[] args) {
        System.out.println("Is the list sorted?");
        int[] testArray = {5, 4, 3, 2, 1, 7};
        // converting to reference type from primitive type as we are using
        // Arrays.sort on the other side.
        int[] sortedArray = arrayOperations.performReverseSortInt(testArray);
        // System.out.println(Arrays.toString(sortedArray));
        // System.out.println(arrayOperations.areTwoArraysEqualInt(testArray, sortedArray));
        if (arrayOperations.areTwoArraysEqualInt(testArray, sortedArray)) {
            System.out.println("List is already in decreasing order");
        } else {
            System.out.println("List is not sorted in decreasing order.");
            System.out.println("List in decreasing order is " + Arrays.toString(sortedArray));
        }
    }
}
