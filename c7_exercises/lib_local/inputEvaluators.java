package lib_local;

import java.util.ArrayList;

public class inputEvaluators {
    public static int[] oddEvenCountReturn(int[] userInput) {
        int[] results = new int[2];
        int even = 0, odd = 0;
        for (int i : userInput) {
            even += (i % 2 == 0 ? 1 : 0);
            odd += (i % 2 != 0 ? 1 : 0);
        }
        results[0] = even;
        results[1] = odd;
        return results;
    }

    public static double largestElement(double[] userInput) {
        double maxElement = 0;
        for (double i : userInput) {
            maxElement = (i > maxElement ? i : maxElement);
        }
        return maxElement;
    }
}
