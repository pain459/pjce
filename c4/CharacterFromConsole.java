package c4;

import java.util.Scanner;

public class CharacterFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s1 = input.nextLine();

        char c1 = s1.charAt(0);

        System.out.print("First word of " + s1 + " is " + c1);
    }
}
