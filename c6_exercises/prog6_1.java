import java.util.Scanner;

public class prog6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will find the pentagonal number.");
        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();
        System.out.println("Pentagonal number for " + userInput + " is " + getPentagonalNumber(userInput));
        System.out.println("All pentagonal numbers for " + userInput + " are below.");
        getPentagonalSequence(userInput);
    }

    public static int getPentagonalNumber(int n) {
        int _result = (n * (3 * n - 1)) / 2;
        return _result;
    }

    public static void getPentagonalSequence(int n) {
        int _counter = 0;
        for (int i = 1; i <= n; i++) {
            if (_counter == 10) {
                System.out.printf("%-10d\n", getPentagonalNumber(i));
                _counter = 0;
            } else {
                System.out.printf("%-10d", getPentagonalNumber(i));
                _counter++;
            }
        }
    }
}
