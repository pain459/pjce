import java.util.Scanner;

public class if_ex_3_5 {
    public static void main(String[] args){
        // Initiate scanner(
        Scanner input = new Scanner(System.in);
        // Salary increment decider program
        System.out.print("Enter the base salary: ");
        double user_salary = input.nextLong();

        System.out.print("Enter the score in int. (Max = 100): ");
        int user_score = input.nextInt();

        if (user_score > 90){
            user_salary = user_salary + (0.03 * user_salary);
            System.out.println("Congratulations!");
            System.out.println("New salary is " + user_salary);
        }

        if (user_score <= 90){
            System.out.println("Hard luck!");
            System.out.println("No change in user salary. Salary is: " + user_salary);
        }
    }
}
