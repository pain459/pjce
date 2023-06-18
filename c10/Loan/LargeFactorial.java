package c10.Loan;
import java.math.*;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("Calculating factorial for a big number.");
        System.out.println("Value of 100! is " + factorial(50));
    }

    public static BigInteger factorial(long n) {
//        BigInteger result = new BigInteger("1");
        BigInteger result = BigInteger.ONE; // Same as above line.
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i))); // See the book pg 407 for actual implementation.
        }
        return result;
    }
}
