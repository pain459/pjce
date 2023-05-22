import java.util.Arrays;
import java.util.Scanner;
import lib_local.*;

public class prog7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sum an array");
        // System.out.print("Enter the array size: ");
        // int _input = input.nextInt();
        // double[] userInput = captureInput.captureArrayOfSize(_input);
        int[] userInput = { 1, 2, 3, 4, 5 }; // use this for overloaded method invocation.
        System.out.println(Arrays.toString(userInput));
        System.out.println("Sum of the elemets in array is " + counters.arrayElementsCounter(userInput));
    }
}
