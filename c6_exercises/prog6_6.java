import java.util.Scanner;

public class prog6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Display pattern");
        System.out.print("Enter the pattern size: ");
        int _input = input.nextInt();
        displayPattern(_input);
    }

    public static void displayPattern(int n) {
        int _final = 1;
        while (_final != n + 1) {
            // System.out.print(_final);
            for (int i = 1; i <= _final; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
            _final++;
        }
    }
}
