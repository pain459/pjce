import java.util.Scanner;
public class prog4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find the character of an ASCII code.");
        System.out.print("Enter a character: ");
        String _s = input.nextLine();
        char _c = _s.charAt(0);
        System.out.println("Selected character is "+ _c);
        Integer _ascii = (int) _c;
        System.out.println("The ASCII code for character E is " + _ascii);
    }
}
