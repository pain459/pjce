import java.util.Scanner;
public class prog5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find the factors of an integer");
        System.out.print("Enter an integer: ");
        int _integer = input.nextInt();
        for (int i = 1; i <= _integer;  i++) {
            if (_integer % i == 0) {
                System.out.print(i + " ");
            } else {
                ;
            }
        }
    }
}
