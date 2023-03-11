import java.util.Scanner;

// By far the inefficient way. May be because I'm a beginner. 

public class ComputeTax {
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // prompt the user to enter filing status
        System.out.println("Welcome to the income tax server.");
        String return_status = "Enter the appropriate option:\n" +
        "0 = Single filer\n" + 
        "1 = Married filing jointly or qualified Widower\n" +
        "2 = Married filing seperately\n" + 
        "3 = Head of household\n" + 
        "Enter your option: ";
        System.out.print(return_status);
        int status = input.nextInt();

        // Adding program termination logic at the start itself.
        if (status != 0 || status != 1 || status != 2 || status != 3) {
            System.out.println("Invalid option. Program will now exit.");
            System.exit(1);
        }

        // Enter the total taxable income
        System.out.print("Enter the taxable income: ");
        double taxable_income = input.nextDouble();

        // compute tax logic
        double tax = 0;

        if (status == 0){
            if (taxable_income <= 8350) {
                tax = taxable_income * 0.10;
            }
            else if (taxable_income <= 33950) {
                tax = 8350 * 0.10 + (taxable_income - 8350) * 0.15;
            }
            else if (taxable_income <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxable_income - 33950) * 0.25;
            }
            else if (taxable_income <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxable_income - 82250) * 0.28;
            }
            else if (taxable_income <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.25 + (taxable_income - 171550) * 0.33;
            }
            else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.25 + (372950 - 171550) * 0.33 + (taxable_income - 372950) * 0.35;
            }
        }
        else if (status == 1){
            if (taxable_income <= 16700) {
                tax = taxable_income * 0.10;
            }
            else if (taxable_income <= 67900) {
                tax = 16700 * 0.10 + (taxable_income - 16700) * 0.15;
            }
            else if (taxable_income <= 137050) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxable_income - 137050) * 0.25;
            }
            else if (taxable_income <= 208850) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (taxable_income - 137050) * 0.28;
            }
            else if (taxable_income <= 372950) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.25 + (taxable_income - 208850) * 0.33;
            }
            else {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.25 + (372950 - 208850) * 0.33 + (taxable_income - 372950) * 0.35;
            }
        }
        else if (status == 2){
            if (taxable_income <= 8350) {
                tax = taxable_income * 0.10;
            }
            else if (taxable_income <= 33950) {
                tax = 8350 * 0.10 + (taxable_income - 8350) * 0.15;
            }
            else if (taxable_income <= 68525) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxable_income - 33950) * 0.25;
            }
            else if (taxable_income <= 104425) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxable_income - 68525) * 0.28;
            }
            else if (taxable_income <= 186475) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.25 + (taxable_income - 104425) * 0.33;
            }
            else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.25 + (186475 - 104425) * 0.33 + (taxable_income - 186425) * 0.35;
            }
        }
        else if (status == 3){
            if (taxable_income <= 11950) {
                tax = taxable_income * 0.10;
            }
            else if (taxable_income <= 45550) {
                tax = 11950 * 0.10 + (taxable_income - 11950) * 0.15;
            }
            else if (taxable_income <= 117450) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxable_income - 45500) * 0.25;
            }
            else if (taxable_income <= 190200) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxable_income - 117540) * 0.28;
            }
            else if (taxable_income <= 372950) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.25 + (taxable_income - 190200) * 0.33;
            }
            else {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.25 + (372950 - 190200) * 0.33 + (taxable_income - 372950) * 0.35;
            }
        }
        // else {
        //     System.out.println("Invalid choice entered. Program will now exit.");
        //     System.exit(1);
        // }
        // Display result
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
