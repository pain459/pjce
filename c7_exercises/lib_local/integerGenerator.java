package lib_local;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class integerGenerator {
    public static int[] generateIntegerArray(int range) {
        int[] generatedArray = new int[range];
        // ArrayList<Integer> generatedArray = new ArrayList<Integer>();
        for (int i = 0; i < range; i++) {
            int _temp = (int) (Math.random() * 10);
            generatedArray[i] = _temp;
        }
        return generatedArray;
    }

    public static int generateRandomNumberExcludingInput(int[] userInput, int min, int max) {
        Random random = new Random();
        int _random = 0;
        // int _random = random.nextInt((max - min + 1) + min);
        Arrays.sort(userInput);  // sorting array for binary search.
        boolean uniqueValueGenerated = false;
        int[] stencilArray = generateIntegerArray(max);
        // loop to find the random number not in the given array.
        while (!uniqueValueGenerated) {
            _random = random.nextInt((max - min + 1) + min);
            if (!(Arrays.binarySearch(userInput, _random) >= 0)) { // returns true of the generated random is not in the user provided inputs.
                uniqueValueGenerated = true;
            }
        }
        return _random;
    }
}
