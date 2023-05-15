package lib_local;

public class counters {
    public static int[] integerCounter(int[] integersList, int min, int max) {
        int[] blankArray = stencilArray(min, max);
        int[] counterArray = new int[max + 1];
        for (int i : integersList) {
            for (int j : blankArray) {
                if (j == i)
                    counterArray[j] += 1;
            }
        }
        return counterArray;
    }

    public static int[] stencilArray(int min, int max) {
        int[] blankArray = new int[max + 1];
        for (int i = min; i <= max; i++) {
            blankArray[i] = i;
        }
        return blankArray;
    }
}
