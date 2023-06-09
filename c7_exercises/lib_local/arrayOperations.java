package lib_local;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.w3c.dom.UserDataHandler;

public class arrayOperations {
    public static double[] reverseArray(double[] userInput) {
        double[] reversedArray = new double[userInput.length];
        for (int i = 0, j = userInput.length - 1; i < userInput.length; i++, j--) {
            reversedArray[j] = userInput[i];
        }
        return reversedArray;
    }

    public static int[] eliminateDuplicates(int[] userInput) {
        List<Integer> cleanedIntegers = new ArrayList<>(); // declared arraylist to add elements dynamically
        int _temp = 0;
        for (int i = 0; i < userInput.length; i++) {
            _temp = userInput[i];
            if (!cleanedIntegers.contains(_temp)) {
                cleanedIntegers.add(_temp); // no need to give index while adding.
            }
        }
        int[] returnedArray = cleanedIntegers.stream().mapToInt(i -> i).toArray();
        return returnedArray;
    }

    public static boolean performLinearSearch(int[] userInput, int searchElement) {
        boolean found = false;
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] == searchElement) {
                found = true;
            }
        }
        return found;
    }

    public static int performBinarySearch(int[] userInput, int searchElement) {
        int low = 0;
        int high = userInput.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (searchElement < userInput[mid]) {
                high = mid - 1;
            } else if (searchElement == userInput[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low - 1; // high < low, key not found.
    }

    public static int[] performSelectionSortInt(int[] userInput) {
        // int[] sortedArray = new int[userInput.length];
        // [2, 9, 5, 4, 8, 1, 6]
        for (int i = 0; i < userInput.length - 1; i++) {
            int currentMin = userInput[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < userInput.length; j++) {
                if (currentMin > userInput[j]) {
                    currentMin = userInput[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                userInput[currentMinIndex] = userInput[i];
                userInput[i] = currentMin;
            }
        }
        return userInput;
    }

    public static int[] performReverseSelectionSortInt(int[] userInput) {
        // int[] sortedArray = new int[userInput.length];
        // [2, 9, 5, 4, 8, 1, 6]
        for (int i = 0; i < userInput.length - 1; i++) {
            int currentMax = userInput[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < userInput.length; j++) {
                if (currentMax < userInput[j]) {
                    currentMax = userInput[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                userInput[currentMaxIndex] = userInput[i];
                userInput[i] = currentMax;
            }
        }
        return userInput;
    }

    public static String[] performSelectionSortIntAndStringArray(int[] userInput, String[] userString) {
        // int[] sortedArray = new int[userInput.length];
        // [2, 9, 5, 4, 8, 1, 6]
        for (int i = 0; i < userInput.length - 1; i++) {
            int currentMin = userInput[i];
            String currentMinString = userString[i];
            int currentMinIndex = i;
            int currentMindStringIndex = i;

            for (int j = i + 1; j < userInput.length; j++) {
                if (currentMin > userInput[j]) {
                    currentMin = userInput[j];
                    currentMinString = userString[j];
                    currentMinIndex = j;
                    currentMindStringIndex = j;
                }
            }

            if (currentMinIndex != i) {
                userInput[currentMinIndex] = userInput[i];
                userString[currentMindStringIndex] = userString[i];
                userInput[i] = currentMin;
                userString[i] = currentMinString;
            }
        }
        return userString;
    }

    public static int[] performBubbleSortInt(int[] userInput) {
        int n = userInput.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (userInput[j] > userInput[j + 1]) {
                    // swap userInput[j+1] and userInput[j]
                    int temp = userInput[j];
                    userInput[j] = userInput[j + 1];
                    userInput[j + 1] = temp;
                }
            }
        }
        return userInput;
    }

    public static int[] performReverseSortInt(int[] userInput) {
        /**The Arrays.sort() method with a custom comparator is applicable only for arrays of reference types, 
         * not for primitive types like int[]. However, you can use the Arrays.stream() method to convert the 
         * int[] array to an Integer[] array and then perform the reverse sorting. */
        Integer[] boxedNumbers = Arrays.stream(userInput).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedNumbers, Comparator.reverseOrder());
        // Integer[] integerArray = {1, 2, 3, 4, 5};
        // converting back from reference type to primitive type\
        int[] intArray = new int[boxedNumbers.length];
        for (int i = 0; i < boxedNumbers.length; i++) {
            intArray[i] = boxedNumbers[i];
        }
        return intArray;
    }

    public static boolean areTwoArraysEqualInt(int[] userinput1, int[] userinput2) {
        boolean areEqual = Arrays.equals(userinput1, userinput2);
        return areEqual;
    }
}
