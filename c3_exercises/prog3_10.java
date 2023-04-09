import java.util.Scanner;
public class prog3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int _n1 = (int) (System.currentTimeMillis() % 1000);
        int _n2 = (int) (System.currentTimeMillis() / 7 % 1000);
        System.out.print("What is " + _n1 + " x " + _n2 + " ? ");
        int _result = input.nextInt();

        if (_result == _n1 * _n2) {
            System.out.println("Your answer is correct.");
        }
        else {
            System.out.println("Sorry, wrong answer. Corrent answer is " + (_n1 * _n2));
        }
    }
}
