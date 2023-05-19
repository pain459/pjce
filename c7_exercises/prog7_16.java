import java.util.Arrays;

import lib_local.*;
public class prog7_16 {
    public static void main(String[] args) {
        System.out.println("Execution time between linear and binary search");
        int[] outPut = integerGenerator.generateArrayOfSizeOfNumberOfDigits(100, 4);
        System.out.println(Arrays.toString(outPut));
        int randomKey = integerGenerator.generateRandomIntegerOfLength(4);
        System.out.println("Generated random integer: " + randomKey);


    }
}
