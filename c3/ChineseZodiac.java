import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        
        // initiate scanner
        Scanner input = new Scanner(System.in);

        // Capture the input.
        System.out.print("Enter the year (max is 2147483647): ");
        int year = input.nextInt();

        // validate the year
        if (year <= 0) {
            System.out.println("Invalid year entered. Program will exit now.");
            System.exit(1);
        }

        String welcome_message = "Welcome to the year of ";

        // Switch statement starts here.
        switch (year % 12) {
            case 0: System.out.println(welcome_message + "monkey"); 
            break;
            case 1: System.out.println(welcome_message + "rooster"); 
            break;
            case 2: System.out.println(welcome_message + "dog"); 
            break;
            case 3: System.out.println(welcome_message + "pig"); 
            break;
            case 4: System.out.println(welcome_message + "rat"); 
            break;
            case 5: System.out.println(welcome_message + "ox"); 
            break;
            case 6: System.out.println(welcome_message + "tiger"); 
            break;
            case 7: System.out.println(welcome_message + "rabbit"); 
            break;
            case 8: System.out.println(welcome_message + "dragon"); 
            break;
            case 9: System.out.println(welcome_message + "snake"); 
            break;
            case 10: System.out.println(welcome_message + "horse"); 
            break;
            case 11: System.out.println(welcome_message + "sheep"); 
            break;        
        }
    }
}
