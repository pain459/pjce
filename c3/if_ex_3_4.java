import java.util.Scanner;

public class if_ex_3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int user_input = input.nextInt();

        if (user_input > 0) {
            int x = 1;
            System.out.println("The value of x is: " + x);
        }
        
        if (user_input <= 0){
            int x = 0;
            System.out.println("The value of x is: " + x);
        }
    }
}
