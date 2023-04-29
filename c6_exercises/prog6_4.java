import java.util.Scanner;
public class prog6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("User method to compute GCD");
        // int _n1 = 12, _n2 = 16;
        System.out.print("Enter 2 positive integers to calculate their GCD: ");
        int _n1 = input.nextInt(), _n2 = input.nextInt();
        System.out.print("GCD is " + gcd(_n1, _n2));
    }

    public static int gcd(int num1, int num2) {
        int _temp = 0;
        int gcd = 0;
        _temp = (num1 > num2) ? num1 : num2;  // conditional expression
        for (int i = 1; i <= _temp; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
