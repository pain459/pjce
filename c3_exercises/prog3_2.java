// package c3_exercises;

import java.util.Scanner;

public class prog3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int _n1 = (int) (Math.random() * 10);
        int _n2 = (int) (Math.random() * 10);
        int _n3 = (int) (Math.random() * 10);
        int _result = _n1 * _n2 * _n3;
        System.out.print("What is " + _n1 + " * " + _n2 + " * " + _n3 + " = ? ");
        int userResult = input.nextInt();
        if (_result == userResult) {
            System.out.println("Right answer.");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
