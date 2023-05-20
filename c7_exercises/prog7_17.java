import java.util.Arrays;
import java.util.Scanner;
import lib_local.*;

public class prog7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sort students");
        System.out.println("Enter the number of students: ");
        int totalStudents = input.nextInt();
        System.out.println("Enter the student names: ");
        String[] userInput = captureInput.captureStringsInArray(totalStudents);
        System.out.println(Arrays.toString(userInput));
        System.out.println("Enter marks now: ");
        int[] userMarks = captureInput.captureArrayOfSizeInt(totalStudents);
        System.out.println(Arrays.toString(userMarks));
        int[] sortedArray = arrayOperations.performSelectionSortInt(userMarks);
        System.out.println(Arrays.toString(sortedArray));
    }
}
