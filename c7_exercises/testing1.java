import java.util.Arrays;

import lib_local.stringGenerators;

public class testing1 {
    public static void main(String[] args) {
        System.out.println("Game: Bean machine");
        int numberOfBalls = 5;
        int numberOfHops = 7;
        // printPattern(numberOfBalls, numberOfHops);
        slotCounter("LLLRLRR", numberOfBalls);
        // System.out.println(Arrays.toString(slot1);
    }

    public static void slotCounter(String pathArray, int numberOfBalls) {
        String[] pathArraySplit = pathArray.split("");
        int[] gameSlots = new int[pathArraySplit.length + 1];
        int R = 0;
        char counter = 'R';
        for (int i = 0; i < pathArraySplit.length; i++) {
            if (counter == pathArray.charAt(i)) {
                System.out.println("R found");
            }
        }
        // System.out.println(R);
    }    
}
