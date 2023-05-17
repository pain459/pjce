package lib_local;

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
}
