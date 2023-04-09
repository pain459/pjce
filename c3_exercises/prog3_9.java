import java.util.Scanner;
public class prog3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calcualte the ISBN number.");
        System.out.print("Enter the first 9 digits of ISBN: ");
        int _isbn = input.nextInt();
        int temp, d1, d2, d3, d4, d5, d6, d7, d8, d9, fut_d10;
        // Splitting the value to integers.
        d9 = _isbn % 10;
        temp = _isbn / 10;
        d8 = temp % 10;
        temp = temp / 10;
        d7 = temp % 10;
        temp = temp / 10;
        d6 = temp % 10;
        temp = temp / 10;
        d5 = temp % 10;
        temp = temp / 10;
        d4 = temp % 10;
        temp = temp / 10;
        d3 = temp % 10;
        temp = temp / 10;
        d2 = temp % 10;
        temp = temp / 10;
        d1 = temp % 10;
        // temp = temp / 10;
        // ISBN last digit calculation begins here.
        fut_d10 = d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9;
        if (fut_d10 % 11 == 10) {
            System.out.println("ISBN is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + 'X');
        }
        else {
            System.out.println("ISBN is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + fut_d10 % 11);
        }
    }
}
