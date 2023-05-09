import java.util.Scanner;

public class prog7_1 {
    public static void main(String[] args) {
        // Driver code.
        Scanner input = new Scanner(System.in);
        System.out.println("Assign grades with input array");
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        int[] studentScores = new int[numberOfStudents]; // dynamic array with number input from Scanner
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            studentScores[i] = input.nextInt();
        }
        // marksEvaluator(new int[] { 44, 55, 70, 58 }); // dummy initiator
        marksEvaluator(studentScores);

    }

    public static void marksEvaluator(int[] marksArray) {
        for (int i = 0; i < marksArray.length; i++) {
            System.out.println("Student " + i + " score is " + marksArray[i] + " and grade is "
                    + gradeEvaluator(marksArray[i], marksArray));
        }
    }

    public static Character gradeEvaluator(int marks, int[] marksArray) {
        int max = maxFinder(marksArray);
        if (marks >= (max - 5)) {
            return 'A';
        } else if (marks >= (max - 10)) {
            return 'B';
        } else if (marks >= (max - 15)) {
            return 'C';
        } else if (marks >= (max - 20)) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static int maxFinder(int[] marksArray) {
        // Find max in the array first.
        int max = marksArray[0];
        for (int i = 1; i < marksArray.length; i++) {
            if (marksArray[i] > max)
                max = marksArray[i];
        }
        return max;
    }
}
