import java.util.Scanner;
import java.util.Arrays;

public class prog7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Reverse the input string.");
        int[] _input = new int[15]; // declaring fixed size array.
        System.out.print("Enter 15 integers to be reversed: ");
        for (int i = 0; i < 15; i++) {
            _input[i] = input.nextInt();
        }
        // int[] _input = {1, 2, 3, 4, 5};
        System.out.print("Reversed input is: ");
        System.out.println(Arrays.toString(reverse(_input)));
    }

    public static int[] reverse (int[] userInput) {
        int[] result = new int[userInput.length]; // declaring an empty array with length that of input.
        // for loop to reverse the array. Dual for-loop to be clear.
        for (int i = 0, j = userInput.length - 1; i < userInput.length; i++, j--) {
            result[j] =  userInput[i];
        }
        return result;
    }
}
