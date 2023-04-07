import java.util.Scanner;

public class if_else_3_4{
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
            System.out.println("Congratulations! Your salary increased by 3%.");
            System.out.println("New salary is " + user_salary);
        }

        else {
            System.out.println("Hard luck!");
            user_salary = user_salary + (0.01 * user_salary);
            System.out.println("Salary increased by 1%. New salary is: " + user_salary);
        }
    }
}
