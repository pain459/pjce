package c10_revision;

public class HomeLoanCalculator {
    public static void main(String[] args) {
        HomeLoan l1 = new HomeLoan();
        System.out.println("Default loan params are as below.");
        l1.getLoanDetails();
        System.out.println("Monthly EMI is " + l1.getMonthlyEmi());
        System.out.println("Total amount payable with interest after the tenure is " + l1.getTotalAmountPayable());

        HomeLoan l2 = new HomeLoan(10000000, 15, 9.5);
        System.out.println("Loan params as below.");
        l2.getLoanDetails();
        System.out.println("Monthly EMI is " + l2.getMonthlyEmi());
        System.out.println("Total amount payable with interest after the tenure is " + l2.getTotalAmountPayable());
//        l2.getAmortizationScheduleYearly();
    }
}
