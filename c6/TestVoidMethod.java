package c6;

import java.util.Scanner;

public class TestVoidMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you marks. Max 100: ");
        double score_input = input.nextDouble();
        System.out.print("The grade is ");
        printGrade(score_input);
    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println("Not qualified. Sorry.");
        }
    }
}
