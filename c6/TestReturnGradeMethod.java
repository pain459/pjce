package c6;
import java.util.Scanner;
public class TestReturnGradeMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you marks (max 100): ");
        double marks = input.nextDouble();
        System.out.println("Your grade is " + getGrade(marks));  
    }
    public static char getGrade(double score) {
        if (score < 0 || score > 100){
            System.out.println("Invalid score.");
            System.exit(1);
        }
        if (score >= 90.0) {
            return 'A';
        }
        else if (score >= 80.0) {
            return 'B';
        }
        else if (score >= 70.0) {
            return 'C';
        }
        else if (score >= 60.0) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
