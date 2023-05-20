import java.util.Arrays;

import lib_local.*;
public class prog7_16 {
    public static void main(String[] args) {
        System.out.println("Execution time between linear and binary search");
        int[] outPut = integerGenerator.generateArrayOfSizeOfNumberOfDigits(10000, 4);
        //System.out.println(Arrays.toString(outPut)); // NOT PRINTING THIS OUTPUT AS IT WILL SPAM.
        int randomKey = integerGenerator.generateRandomIntegerOfLength(4);
        System.out.println("Generated random integer: " + randomKey);
        long startTime = System.currentTimeMillis();
        boolean result = arrayOperations.performLinearSearch(outPut, randomKey);
        System.out.println("Did we find the element? " + result);
        long endTime = System.currentTimeMillis();
        timingOperations.totalTimeTakenInMillis(startTime, endTime, "linear Search");
        // sorting the arrays now.
        long startTimeSort = System.currentTimeMillis();
        Arrays.sort(outPut);
        long endTimeSort = System.currentTimeMillis();
        // System.out.println(Arrays.toString(outPut));
        timingOperations.totalTimeTakenInMillis(startTimeSort, endTimeSort, "sorting");
        long startTimeBinarySearch = System.currentTimeMillis();
        int result2 = arrayOperations.performBinarySearch(outPut, randomKey);
        System.out.println(result2);
        long stopTimeBinarySearch = System.currentTimeMillis();
        timingOperations.totalTimeTakenInMillis(startTimeBinarySearch, stopTimeBinarySearch, "Binary Search");

    }
}
