package c2_exercises;

import java.util.Scanner;

public class prog2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long curr_population = 312_032_486;
        long one_birth = 7;
        long one_death = 13;
        long one_immigrant = 45;
        System.out.print("Enter the years to project the data: ");
        int years_to_count = input.nextInt();
        // int years_to_count = 5;
        long total_seconds_in_year = 31536000;
        System.out.println("Current population is " + curr_population);
        for (int i = 1; i <= years_to_count; i++) {
            curr_population = curr_population + (total_seconds_in_year / 7) - (total_seconds_in_year / 13)
                    + (total_seconds_in_year / 45);
            System.out.println("Total population in " + i + " year is " + curr_population);
        }
    }
}
