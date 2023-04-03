package c2_exercises;

import java.util.Scanner;

public class prog2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double _subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double _gratuity_percent = input.nextDouble();

        double _gratuity = _gratuity_percent * _subtotal / 100;
        double _total = _subtotal + _gratuity;

        System.out.print("The gratuity is $" + _gratuity + " and total is $" + _total);
    }
}
