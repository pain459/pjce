import java.util.Scanner;
public class prog6_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of days in a year");
        System.out.print("Enter the year to find the number of days in it: ");
        int _input = input.nextInt();
        System.out.println("Number of days in " + _input + " is " + numberOfDaysInAYear(_input));
    }

    public static int numberOfDaysInAYear(int year) {
        int _total = 0;
        int _jan = 31, _mar = 31, _apr = 30, _may = 31, _jun = 30, _jul = 31, _aug = 31, _sep = 30, _oct = 31, _nov = 30, _dec = 31;
        int _set1 = _jan + _mar + _may + _jul + _aug + _oct + _dec;
        int _set2 = _apr + _jun + _sep + _nov;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return _set1 + _set2 + 29;
        }
        else {
            return _set1 + _set2 + 28;
        }
    }
}
