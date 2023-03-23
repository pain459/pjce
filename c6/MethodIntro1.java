package c6;
import java.util.Scanner;
public class MethodIntro1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        // boolean loop1 = true;
        while (loop) {
            // while (loop1) {

            // }
            System.out.println("Enter the range of numbers to sum.");
            System.out.print("Enter first number: ");
            int input1 = input.nextInt();
            System.out.print("Enter second number: ");
            int input2 = input.nextInt();
            if ((input1 > input2) || (input1 < 0) || (input2 < 0)) {
                System.out.print("You have entered invalid inputs. Do you want to try again? (y/n): ");
                char choice2 = input.next().charAt(0);
                if (choice2 == 'y') {
                    loop = true;
                    continue;
                }
                else {
                    System.out.println("Alrighty! Good bye!");
                    loop = false;
                    break;
                }
            }
            System.out.println("Sum from " + input1 +  " to " + input2 + " is: " + sum(input1, input2));
            System.out.print("Do you want to try again (y/n): ");
            char choice1 = input.next().charAt(0);

            if (choice1 == 'y') {
                loop = true;
            }
            else {
                System.out.println("Good Bye!");
                // System.exit(1);
                loop = false;
            }

        }
        System.out.println("Program ended now!");
    }
    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++) {
            result += i;
        }
        return result;        
    }
}
