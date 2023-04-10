import java.util.Scanner;
public class prog3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f, temp, rem;
        System.out.print("Enter a three-digit integer: ");
        int _input = input.nextInt();
        c = f = _input % 10;
        temp = _input / 10;
        b = e = temp % 10;
        temp = temp / 10;
        a = d = temp;
        // System.out.println("values are: " + temp);
        if (a == f && c == d) {
            System.out.println(_input + " is a palindrome.");
        } else {
            System.out.println(_input + " is not a palindrome.");
        }
    }
}
