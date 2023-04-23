import java.util.Scanner;

public class prog5_14 {
    public static void main(String[] args) {
        System.out.println("Find common GCD for two positive numbers.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two positive integers seperated by space: ");
        int _n1 = input.nextInt();
        int _n2 = input.nextInt();
        // int _n1 = 15;
        // int _n2 = 45;
        boolean _found = false;
        // we will make _n1 smaller than _n2 by swapping if required.
        if (_n1 > _n2) {
            ;
        } else {
            int _temp = _n1;
            _n1 = _n2;
            _n2 = _temp;
        }
        int _d = _n1;
        while (!_found) {
            if (_n1 % _d == 0 && _n2 % _d == 0) {
                System.out.println("GCD is " + _d);
                _found = true;
            } else {
                _d--;
            }
        }
    }
}
