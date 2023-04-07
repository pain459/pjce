package c4;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String s1 = input.next();
        System.out.print("Enter String2: ");
        String s2 = input.next();

        System.out.println(s1.equals(s2));

        if (s1.equals(s2)) {
            System.out.println("Both strings are the same!");
        }
        else {
            System.out.println("Both strings are not the same!");
        }
    }
}
