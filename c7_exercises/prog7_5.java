import lib_local.*;

public class prog7_5 {
    public static void main(String[] args) {
        System.out.println("Count Even and Odd numbers entered.");
        System.out.print("Enter numbers: ");
        int[] userInput = captureInput.captureInputZeroExit();
        int[] results = inputEvaluators.oddEvenCountReturn(userInput);
        System.out.println("The number of even numbers: " + results[0]);
        System.out.println("The number of odd numbers: " + results[1]);
    }
}
