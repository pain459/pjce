import java.util.Scanner;

public class prog4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hex to Decimal converter");
        System.out.print("Enter a hex character: ");
        String userInput = input.nextLine();
        // implementing try catch block to do the heavy lifting
        try {
            int _decimal = Integer.parseInt(userInput, 16);
            System.out.println("The binary value is " + _decimal);
        } catch (NumberFormatException e) {
            System.out.println(userInput + " is an invalid input.");
        }
    }
}
