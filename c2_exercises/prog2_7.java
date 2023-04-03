package c2_exercises;

import java.util.Scanner;

public class prog2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long _minutes = input.nextLong();
        long _years = _minutes / 60 / 24 / 365;
        long _days = _minutes / 60 / 24 % 365;
        System.out.println(_minutes + " minutes is approximately " + _years + " years and " + _days + " days.");

    }
}
