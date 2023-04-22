import java.util.*;
public class prog5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Program will generate low scoring student name with marks.");
        System.out.print("Enter the number of entries you want to verify: ");
        int numberOfRecords = input.nextInt();
        double lowestScore = Double.MAX_VALUE;
        String lowestScorer = "";
        // Map <String, Double> studentsMapping = new HashMap<String, Double>(numberOfRecords);
        while (numberOfRecords > 0){
            // System.out.println("Loop success. Entry number " + numberOfRecords);
            System.out.print("Enter student name: ");
            String studentName = input.next();
            System.out.print("Enter student marks: ");
            double studentMarks = input.nextDouble();
            // studentsMapping.put(studentName, studentMarks);
            if (studentMarks < lowestScore) {
                lowestScore = studentMarks;
                lowestScorer = studentName;
            } else {
                ;
            }
            numberOfRecords--;
        }
        // Getting the minimum score details.
        // double minimumScorer = Collections.min(studentsMapping.values());
        // System.out.println("Minimum score is " + minimumScorer);
        System.out.println("Lowest scorer is student: " + lowestScorer);
        System.out.println("Lowest score is: " + lowestScore);
    }
}
