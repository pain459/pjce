import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

import lib_local.*;

public class prog7_4 {
    public static void main(String[] args) {
        System.out.println("Analyze scores. Max score considered is 100.");
        System.out.print("Enter the scores (negative number quits the loop): ");
        int[] userInput = captureInput.captureInputNegativeExit();
        int[] results = scoreEvaluator(userInput);
        System.out.println("Students below average are: " + results[0]);
        System.out.println("Students in average are: " + results[1]);
        System.out.println("Students above average are: " + results[2]);

    }

    public static int[] scoreEvaluator(int[] inputScores) {
        int[] results = new int[3];
        int avg = 0, bavg = 0, aavg = 0;
        for (int i : inputScores) { // using for each loop.
            bavg += (i < 60 ? 1 : 0);
            avg += (i > 60 || i < 80 ? 1 : 0);
            aavg += (i > 80 ? 1 : 0);
        }
        results[0] = bavg;
        results[1] = avg;
        results[2] = aavg;
        return results;
    }
}
