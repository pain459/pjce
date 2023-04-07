package c4;

import java.util.Scanner;

public class StringFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three words. You may give space or enter after a word - ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();

        System.out.println("First string s1 is: " + s1);
        System.out.println("Second string s2 is: " + s2);
        System.out.println("Third string s3 is: " + s3);
    }
}
