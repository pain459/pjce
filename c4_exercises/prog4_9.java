import java.util.Scanner;
public class prog4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String _s = input.nextLine();
        char _c = _s.charAt(0);
        System.out.printf("The unicode for the character is \\u%04x", (int) _c);
    }
}