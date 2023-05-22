import java.util.Arrays;

import lib_local.captureInput;
import lib_local.inputEvaluators;
import lib_local.integerGenerator;

public class prog7_13 {
    public static void main(String[] args) {
        System.out.println("Random number chooser.");
        System.out.println("Enter the numbers between 1 to 54 only. Negative number to exit loop: ");
        int[] userInput = captureInput.captureInputNegativeExit();
        System.out.println(Arrays.toString(userInput));
        System.out.println("Evaluating inputs");
        if (inputEvaluators.inputInRange(userInput, 1, 54)) {
            System.out.println("All entried in given range. Proceeding further.");
        } else {
            System.out.println("Input detected out of range. Program exits now.");
            System.exit(1);
        }
        int _result = integerGenerator.generateRandomNumberExcludingInput(userInput, 1, 54);
        System.out.println("Generated random number is: " + _result);
    }
}
