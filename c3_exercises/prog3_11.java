import java.util.Scanner;
public class prog3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month number and year: ");
        int _month = input.nextInt();
        int _year = input.nextInt();
        int _k = 31, _n = 30, _f = 28;
        // Leap year conditions.
        // The year is multiple of 400.
        // The year is multiple of 4 and not multiple of 100.
        switch (_month){
            case 1: System.out.println("January of " + _year + " has " + _k + " days.");
            break;
            case 2: if (_year % 400 == 0 || (_year % 4 == 0 && _year % 100 != 0)) {
                System.out.print("February of " + _year + " has " + (_f + 1) + " days.");
            } else {
                System.out.print("February of " + _year + " has " + _f + " days.");
            } break;
            case 3: System.out.println("March of " + _year + " has " + _k + " days.");
            break;
            case 4: System.out.println("April of " + _year + " has " + _n + " days.");
            break;
            case 5: System.out.println("May of " + _year + " has " + _k + " days.");
            break;
            case 6: System.out.println("June of " + _year + " has " + _n + " days.");
            break;
            case 7: System.out.println("July of " + _year + " has " + _k + " days.");
            break;
            case 8: System.out.println("August of " + _year + " has " + _k + " days.");
            break;
            case 9: System.out.println("September of " + _year + " has " + _n + " days.");
            break;
            case 10: System.out.println("October of " + _year + " has " + _k + " days.");
            break;
            case 11: System.out.println("November of " + _year + " has " + _n + " days.");
            break;
            case 12: System.out.println("December of " + _year + " has " + _k + " days.");
            break;
            default: System.out.println("Something is wrong.");
            break;
        }
    }
}