import java.util.*;
// import java.util.Scanner;

public class prog4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean leapYear = false;
        // int leapYearMonth = 0;
        System.out.println("Days of a month");

        // Take the year and evaluate if it is leap year or not.
        System.out.print("Enter a year: ");
        int _year = input.nextInt();
        if (_year % 400 == 0 || (_year % 4 == 0 && _year % 100 != 0)) {
            // System.out.println("Leap Year");
            leapYear = true;
        } else {
            // System.out.println("Normal Year");
            ;
        }

        // evaluate the month entry
        System.out.print("Enter a month: ");
        String _month = input.next();
        if (Character.isUpperCase(_month.charAt(0)) && _month.length() == 3) {
            ;
        } else {
            System.out.println("Invalid input. Program will exit now.");
            System.exit(1);
        }

        // month to days mapping.
        Dictionary<String, Integer> monthToDays = new Hashtable<>();
        monthToDays.put("Jan", 31);
        monthToDays.put("Feb", 28);
        monthToDays.put("Mar", 31);
        monthToDays.put("Apr", 30);
        monthToDays.put("May", 31);
        monthToDays.put("Jun", 30);
        monthToDays.put("Jul", 31);
        monthToDays.put("Aug", 31);
        monthToDays.put("Sep", 30);
        monthToDays.put("Oct", 31);
        monthToDays.put("Nov", 30);
        monthToDays.put("Dec", 31);
        monthToDays.put("FebL", 29);

        // Logic to give the days
        if (!leapYear) {
            System.out.println(_month + " " + _year + " has " + monthToDays.get(_month) + " days");
        } else if (leapYear) {
            if (_month.matches("Feb")) {
                System.out.println(_month + " " + _year + " has " + monthToDays.get("FebL") + " days");
            } else {
                System.out.println(_month + " " + _year + " has " + monthToDays.get(_month) + " days");
            }
        }
    }
}
