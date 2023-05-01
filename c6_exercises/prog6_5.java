import java.util.Scanner;
import java.util.Arrays;

public class prog6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sort three numbers");
        System.out.print("Enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double _dummy = 0;
        double num4 = 0;
        double num5 = 0;
        // List<Double> newList = new ArrayList<Double>();
        double[] newList = new double[3];
        newList[0] = num1;
        newList[1] = num2;
        newList[2] = num3;
        // newList[3] = num4;
        // newList[4] = num5;
        Arrays.sort(newList);
        System.out.print("Sorted elements are ");
        for (int i = 0; i < newList.length; i++) {
            System.out.print(newList[i] + " ");
        }
    }
}
