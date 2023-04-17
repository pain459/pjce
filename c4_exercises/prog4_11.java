import java.util.Scanner;

public class prog4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Binary to decimal. Limit to 4 places.");
        System.out.print("Enter binary digits (0000 to 1111): ");
        String _input = input.nextLine();
        char _p4 = _input.charAt(3);
        char _p3 = _input.charAt(2);
        char _p2 = _input.charAt(1);
        char _p1 = _input.charAt(0);
        // logic of 8421 to 0000 starts now.
        // p1 p2 p3 p4
        int _result = 0;
        if (_p1 == '1') {
            // _result += 1;
            _result = _result + 8;
        }
        if (_p2 == '1') {
            _result = _result + 4;
        }
        if (_p3 == '1') {
            _result = _result + 2;
        }
        if (_p4 == '1') {
            _result = _result + 1;
        }

        System.out.println("The decimal value is " + _result);
    }
}