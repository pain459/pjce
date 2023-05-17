import lib_local.captureInput;
import lib_local.mathOperations;
import java.util.Scanner;

public class prog7_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Statistics: Compute Deviation");
        System.out.print("Enter ten numbers: ");
        double[] userInput = captureInput.captureArrayOfSize(10);
        // double[] testArray = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};
        System.out.printf("Calculated mean is %.2f\n", mathOperations.calculateMeanForGivenArray(userInput));
        System.out.printf("Calculated deviation is %.5f\n", mathOperations.calculateDeviationForGivenMean(userInput));
    }
}
