import java.util.*;

public class prog5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double newTutionFee = 0;
        System.out.println("Financial application: compute future tution fee");
        System.out.print("Enter the current tution fee: ");
        double tutionFee = input.nextDouble();
        System.out.print("Enter the increase per year in percentage: ");
        double percentageIncrease = input.nextDouble();
        System.out.print("Enter the total years to calculate: ");
        int yearsToCalculate = input.nextInt();

        for (int i = 1; i <= yearsToCalculate; i++) {
            newTutionFee = percentageIncrease * tutionFee / 100 + tutionFee;
            System.out.printf("Tution fee for year %2s is %.2f\n", i, newTutionFee);
            tutionFee = newTutionFee;
        }
    }
}
