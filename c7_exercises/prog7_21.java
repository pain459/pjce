import java.util.Arrays;

import lib_local.stringGenerators;

public class prog7_21 {
    public static void main(String[] args) {
        System.out.println("Game: Bean machine");
        int numberOfBalls = 20;
        int numberOfHops = 7;
        for (int i = 0; i < numberOfBalls; i++) {
            String path = printPattern(numberOfHops);
            char[] slot1 = slotCounter(path);
            System.out.println(Arrays.toString(slot1));
        }
    }

    public static String printPattern(int numberOfHops) {
        // int[] slots = new int[numberOfBalls + 1];
        String path = "";
        for (int i = 0; i < numberOfHops; i++) {
            path = stringGenerators.generateStringWithTwoLetters(numberOfHops, 'R', 'L');
        }
        return path;
    }

    public static char[] slotCounter(String pathArray) {
        // String[] pathArraySplit = pathArray.split("");
        char[] gameSlots = new char[pathArray.length() + 1];
        int R = 0;
        for (int i = 0; i < pathArray.length(); i++) {
            if (pathArray.charAt(i) == 'R') {
                R++;
            }
            // gameSlots[R] = R;
        }
        gameSlots[R] = 'O';
        return gameSlots;
    }

    
}
