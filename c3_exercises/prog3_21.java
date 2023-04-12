import java.util.Scanner;

public class prog3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int _year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int _month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int _day = input.nextInt();
        if (_month == 1) {
            _month = 13;
            _year--;
        } else if (_month == 2) {
            _month = 14;
            _year--;
        }

        int _h = (_day + ((26 * (_month + 1)) / 10) + (_year % 100) + ((_year % 100) / 4) + ((_year / 100) / 4)
                + (5 * (_year / 100)))
                % 7;
        System.out.print("Day of the week is ");
        switch (_h) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }

    }
}
