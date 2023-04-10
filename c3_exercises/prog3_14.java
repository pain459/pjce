import java.util.Scanner;

public class prog3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for heads and 1 for tails: ");
        byte _choice = input.nextByte();
        // logic starts here.
        int _toss = 0;
        if ((int) (Math.random() * 10) >= 5) {
            _toss = 0;
        } else {
            _toss = 1;
        }

        if (_toss == _choice) {
            System.out.println("You won the toss.");
        } else {
            System.out.println("You lost the toss.");
        }
    }
}
