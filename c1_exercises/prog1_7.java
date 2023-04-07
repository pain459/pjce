package c1_exercises;

import java.util.Scanner;

public class prog1_7 {
    public static void main(String[] args) {
        double pi_cal1 = 4.0
                * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13) - 1.0 / 15);
        System.out.println(pi_cal1);
        // using leibniz theorem
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total iterations to be calculated for pi using leibniz theorem: ");
        int iter_value = input.nextInt();
        double pi_cal2 = 0;
        for (int i = 1; i <= iter_value; i++) {
            pi_cal2 += Math.pow(-1.0, i + 1.0) / ((2.0 * i) - 1.0);
        }

        System.out.println("Approximated pi per leibniz theorem is: " + pi_cal2 * 4.0);
    }
}
