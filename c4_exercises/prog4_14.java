import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class prog4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert letter grade to number");
        System.out.print("Enter a letter grade: ");
        String _input = input.nextLine();
        if (_input.length() != 1) {
            System.out.println("Invalid input. Program will exit now.");
            System.exit(1);
        }
        char _check = _input.charAt(0);
        _check = Character.toUpperCase(_check);
        List<Character> aList = new ArrayList<Character>();
        aList.add('A');
        aList.add('B');
        aList.add('C');
        aList.add('D');
        aList.add('F');

        // System.out.println(aList);
        if (!aList.contains(_check)) {
            System.out.println(_check + " is the invalid grade.");
            System.exit(1);
        }
        String message_String = "The numeric value for grade ";
        switch (_input) {
            case "A":
                System.out.println(message_String + _check + " is 4");
                break;
            case "B":
                System.out.println(message_String + _check + " is 3");
                break;
            case "C":
                System.out.println(message_String + _check + " is 2");
                break;
            case "D":
                System.out.println(message_String + _check + " is 1");
                break;
            case "F":
                System.out.println(message_String + _check + " is 0");
                break;
        }
    }
}
