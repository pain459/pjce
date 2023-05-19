package lib_local;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        for (int i = 0; i < userInput.length; i++ ){
            _temp = userInput[i];
            if (!cleanedIntegers.contains(_temp)) {
                cleanedIntegers.add(_temp); // no need to give index while adding.
            }
        }      
        int[] returnedArray = cleanedIntegers.stream().mapToInt(i -> i).toArray();
        return returnedArray;
    }
}
