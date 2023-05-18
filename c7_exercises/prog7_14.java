import lib_local.*;
public class prog7_14 {
    public static void main(String[] args) {
        System.out.println("Computing GCD");
        int[] testArray = {13, 17, 19};
        int _gcd = mathOperations.calculateGCDForGivenArray(testArray);
        System.out.println("GCD is " + _gcd);
    }
}
