import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class prog5_26 {
    public static void main(String[] args) {
        System.out.println("Compute e");
        BigDecimal e = BigDecimal.ONE;
        BigDecimal fact = BigDecimal.ONE;
        for (int i = 100; i <= 1000; i += 100) {
            for (int j = 1; j <= i; j++) {
                fact = fact.multiply(new BigDecimal(i));
                e = e.add(BigDecimal.ONE.divide(fact, new MathContext(10000, RoundingMode.HALF_UP)));
            }
            System.out.println("e value for " + i + " iterations is " + e.floatValue());
            e = BigDecimal.ONE;
        }
    }
}

// BigDecimal bigInt = BigDecimal.valueOf(12);
// int regularInt = 6;

// BigDecimal result = bigInt.divide(BigDecimal.valueOf(regularInt));

// System.out.println(result); // => 2