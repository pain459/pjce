package c5;

import java.util.Scanner;

public class FutureTution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current tution fee: ");
        double current_fee = input.nextDouble();

        int years = 0;
        double new_fee = 0;
        new_fee = 2 * current_fee;

        while (current_fee < new_fee){
            current_fee = current_fee * 1.07;
            years++;
        }
        System.out.println("Tution fee will be doubled in " + years + " years.");
        System.out.printf("Tution fee will be $%.2f in %1d years", current_fee, years);
    }
}
