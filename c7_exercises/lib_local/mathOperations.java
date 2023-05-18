package lib_local;
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class mathOperations {
    public static double calculateMeanForGivenArray(double[] userInput) {
        int _n = userInput.length;
        double _sum = 0;
        for (double i : userInput) {
            _sum += i;
        }
        return _sum/_n;
    }

    public static double calculateDeviationForGivenMean(double[] userInput){
        int _denominator = userInput.length - 1;
        double _numerator = 0;
        double _deviation = 0;
        for (double i : userInput) {
            _numerator += Math.pow(i - calculateMeanForGivenArray(userInput), 2);
        }
        _deviation = Math.sqrt((_numerator/_denominator));
        return _deviation;
    }

    public static int calculateGCDForGivenArray(int[] userInput) {
        // int[] testArray = {10, 15, 20, 25};
        // int[] testArray = {13, 17, 19};
        int j = 1; // initial gcd
        int k = 2; // possible gcd
        int l = 0;
        boolean foundGCD = false;
        for (int i = 1; i < userInput.length; i++) {
            if (userInput[0] % k == 0 && userInput[i] % k == 0) {
                l = k;
            }
        }
        return k;
    }
}
