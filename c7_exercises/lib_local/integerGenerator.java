package lib_local;

import java.util.ArrayList;

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
}
