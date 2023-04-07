package c1_exercises;
import java.util.Scanner;
public class prog1_10 {
    public static void main(String[] args) {
        System.out.println("This program will calculate the average speed of runner by taking input in kilometers: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        double distance = input.nextDouble();
        System.out.print("Enter the time in minutes.seconds: ");
        double time = input.nextDouble();
        System.out.println("Average speed of the runner is: " + distance / (time / 60) + " km/h" );
        System.out.println("Average speed of the runnin is: " + (distance / (time / 60)) / 1.6 + " m/h");
    }
}
