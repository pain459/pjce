package lib_local;

public class arrayOperations {
    public static double[] reverseArray(double[] userInput) {
        double[] reversedArray = new double[userInput.length];
        for (int i = 0, j = userInput.length - 1; i < userInput.length; i++, j--) {
            reversedArray[j] = userInput[i];
        }
        return reversedArray;
    }
}
