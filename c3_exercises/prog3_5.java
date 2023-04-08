<<<<<<< HEAD
// package c3_exercises;
=======
>>>>>>> 1c3f64a7486c5d01d82ebab92104353285ed346d
import java.util.Scanner;
public class prog3_5 {
    public static void main(String[] args) {
	// initiating the scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int dayToday = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();
        int totalDays = dayToday + daysElapsed;
        int switchDay = 0;
        if (dayToday == 0) {
            System.out.print("Today is Sunday and future day is ");
        } else if (dayToday == 1) {
            System.out.print("Today is Monday and future day is ");
        } else if (dayToday == 2) {
            System.out.print("Today is Tuesday and future day is ");
        } else if (dayToday == 3) {
            System.out.print("Today is Wednesday and future day is ");
        } else if (dayToday == 4) {
            System.out.print("Today is Thursday and future day is ");
        } else if (dayToday == 5) {
            System.out.print("Today is Friday and future day is ");
        } else if (dayToday == 6) {
            System.out.print("Today is Saturday and future day is ");
        } 
        if (totalDays <= 6) {
            switchDay = totalDays;
        }
        else if (totalDays > 6) {
            switchDay = totalDays % 7;
        }

        switch (switchDay) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
