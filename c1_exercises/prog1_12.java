package c1_exercises;
import java.util.Scanner;
public class prog1_12 {
    public static void main(String[] args) {
        System.out.println("This program will calculate the average speed of runner by taking input in miles: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in miles: ");
        double distance = input.nextDouble();
        System.out.print("Enter the hours: ");
        double hours = input.nextDouble();
        System.out.print("Enter the minutes: ");
        double minutes = input.nextDouble();
        System.out.print("Enter the seconds: ");
        double seconds = input.nextDouble();
        double time = hours * 60 + minutes + seconds / 60;
        System.out.println("Average speed of the runner is: " + distance / (time / 60) + " mi/h" );
        System.out.println("Average speed of the runner is: " + (distance / (time / 60)) * 1.6 + " km/h");
    }
}
