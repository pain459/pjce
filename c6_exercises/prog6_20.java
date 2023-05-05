import java.util.Scanner;

public class prog6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Count the letters in a string");
        System.out.print("Enter the string to count the number of characters: ");
        String _input = input.next();
        System.out.println("Number of characters in the given string is " +
                countLetters(_input));
    }

    public static int countLetters(String s) {
        int _count = 0;
        for (char c : s.toCharArray()) {
            _count++;
        }
        return _count;
    }
}
