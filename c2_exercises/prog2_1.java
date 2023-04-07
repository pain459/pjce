package c2_exercises;
import java.math.BigDecimal;
import java.util.Scanner;
public class prog2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        BigDecimal miles = input.nextBigDecimal();
        BigDecimal conv_factor = new BigDecimal(1.6);
        BigDecimal kms = miles.multiply(conv_factor);
        System.out.println(miles + " miles is converted to " + kms + " kilometers.");
    }
}
