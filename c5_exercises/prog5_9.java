import java.util.*;
public class prog5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Program will generate last two low scoring students names with marks.");
        System.out.print("Enter the number of entries you want to verify: ");
        int numberOfRecords = input.nextInt();
        double lowestScore1 = Double.MAX_VALUE, lowestScore2 = Double.MAX_VALUE;
        String lowestScorer1 = "", lowestScorer2 = "";
        while (numberOfRecords > 0){
            System.out.print("Enter student name: ");
            String studentName = input.next();
            System.out.print("Enter student marks: ");
            double studentMarks = input.nextDouble();
            // need to rewrite logic
            if (studentMarks < lowestScore1) {
                lowestScore1 = studentMarks;
                lowestScorer1 = studentName;
                lowestScore2 = studentMarks + 1;
                lowestScorer2 = studentName;
                if (lowestScore2 < lowestScore1) {
                    lowestScore2 = lowestScore1;
                    lowestScorer2 = lowestScorer1;
                }
            } else {
                ;
            }
            numberOfRecords--;
        }
        // Getting the minimum score details.
        System.out.println("Lowest scorer is student: " + lowestScorer1);
        System.out.println("Lowest score is: " + lowestScore1);
        System.out.println("Second lowest scorer is student: " + lowestScorer2);
        System.out.println("Second lowest score is: " + lowestScore2);
    }
}
