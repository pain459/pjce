import java.util.*;

public class prog4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Financial application: payroll");
        // take inputs from the users.
        System.out.print("Enter employee's name: ");
        String employeeName = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax holding rate: ");
        double federalTaxHoldingRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxWithholdingRate = input.nextDouble();

        // calculations start
        double grossPay = (hoursWorked * hourlyPayRate);
        double netDeductions = (grossPay * federalTaxHoldingRate) + (grossPay * stateTaxWithholdingRate);
        double netPay = grossPay - netDeductions;

        // print results
        System.out.println("Employee name: " + employeeName);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.printf("%24s%2.1f%4s%.2f\n", "Federal Withholding (", federalTaxHoldingRate * 100,
                "%): $", grossPay * federalTaxHoldingRate);
        System.out.printf("%22s%2.1f%4s%.2f\n", "State Withholding (", stateTaxWithholdingRate * 100,
                "%): $", grossPay * stateTaxWithholdingRate);
        System.out.printf("%26s\n", "Total Deduction: $" + netDeductions);
        System.out.println("Net Pay: $" + netPay);
    }
}
