import java.util.*;
public class prog5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int exitTrap = 0;
        System.out.println("Pass of Fail");
        System.out.print("Enter your score (enter -1 to exit): ");
        int _score = input.nextInt();
        exitTrap = _score;    
        while (exitTrap != -1) {
            if (_score >= 60) {
                System.out.println("You pass the exam!");
            } else if (_score < 60) {
                System.out.println("You don't pass the exam!");
            } 
            System.out.print("Enter your score (enter -1 to exit): ");
            _score = input.nextInt();
            exitTrap = _score;
        }
    }    
}
