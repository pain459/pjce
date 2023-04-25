import java.math.BigInteger;

public class prog5_26 {
    public static void main(String[] args) {
        System.out.println("Compute e");
        BigInteger _factorial = BigInteger.ONE;
        int _factor = 1;
        BigInteger _result = BigInteger.ONE;

        for (int i = 10000; i <= 100000; i += 10000) {
            for (int j = i; j >= 1; j--) {
                _factorial = _factorial.multiply(BigInteger.valueOf(j));
                _result = _factorial.divide(BigInteger.valueOf(_factor));
            }
            Float _f1 = _result.floatValue();
            System.out.printf("%.10f\n", _f1);
            _factorial = BigInteger.ONE;
        }
    }
}

// BigInteger bigInt = BigInteger.valueOf(12);
// int regularInt = 6;

// BigInteger result = bigInt.divide(BigInteger.valueOf(regularInt));

// System.out.println(result); // => 2