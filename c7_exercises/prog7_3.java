import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class prog7_3 {
    public static void main(String[] args) {
        System.out.println("Count occurence of numbers");
        System.out.print("Enter the integers between 1 and 50: ");
        captureInput();
        int[] testarray = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        repeatChecker(testarray);
    }

    /**capturing user input in form of a method */
    public static void captureInput() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            else if (num > 50) {
                System.out.println("Entered value above 50. Program exits now.");
                System.exit(1);
                // break;
            }
            else {
                userInput.add(num);
            }
        }
        System.out.println(userInput);
    }

    public static void repeatChecker(int[] arrayToCheck) {
        int count = 0;
        int[] cloneArray = new int[arrayToCheck.length];
        System.arraycopy(arrayToCheck, 0, cloneArray, 0, arrayToCheck.length);
        for (int i = 0; i < arrayToCheck.length; i++) {
            for (int j = 0; j < cloneArray.length; j++) {
                if (cloneArray[j] == arrayToCheck[i]) {
                    count++;
                }
                System.out.println(cloneArray[j] + " occurs " + count + " times ");
            }
        }
    }
}
