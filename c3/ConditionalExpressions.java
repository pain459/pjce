import java.util.Scanner;

public class ConditionalExpressions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for x, which determines value of y: ");
        int x_input = input.nextInt();

        // Conditional Expression here.
        int y = (x_input > 0) ? 1 : -1;

        System.out.println("Value of y is decided as " + y);

        // one more example of conditional expression
        System.out.println((x_input % 2 == 0 ) ? "Entered x is even" : "Entered x is odd");
    }
}
