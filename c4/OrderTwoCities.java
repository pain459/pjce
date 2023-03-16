package c4;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0) {
            System.out.println("Entered cities are alphabetical in order. " + city1 + " and " + city2);
        }
        else {
            System.out.println("Entered cities are not alphabattically arranged. " + city1 + " and " + city2);
        }
    }
}
