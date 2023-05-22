import lib_local.*;

public class prog7_9 {
    public static void main(String[] args) {
        System.out.println("Find the largest element");
        double[] testArray = { 1.9, 2.5, 3.7, 2, 1.5, 6, 3, 4, 5, 2 };
        double _result = inputEvaluators.largestElement(testArray);
        String valueString = String.valueOf(_result);
        // usage of substring and endswith in string class.
        if (valueString.endsWith(".0")) {
            String subString = valueString.substring(0, valueString.length() - 2);
            System.out.println("Max element in the given array is " + Integer.parseInt(subString));
        } else {
            System.out.println("Max element in the given array is " + Double.parseDouble(valueString));
        }
    }
}
