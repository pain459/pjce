package c2_exercises;

import java.util.Scanner;

public class prog2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the timezone offset to GMT: ");
        int _offset = input.nextInt();
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currenHour = totalHours % 24;
        long currentHourPerOffset = (totalHours + _offset) % 24;

        System.out.println("The current time is " + currentHourPerOffset + ":" + currentMinute + ":" + currentSecond);
    }
}
