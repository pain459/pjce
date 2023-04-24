public class prog5_22 {
    public static void main(String[] args) {
        System.out.println("Financial application: Loan amortization schedule");
        int loanAmount = 10000;
        int numberOfYears = 1;
        double annualInterestRate = 7.0;
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Number of Years: " + numberOfYears);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.println("");
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);
        double balance = loanAmount;
        // System.out.println("Payment#\tinterest\tPrincipal\tBalance");
        System.out.printf("%s%15s%17s%15s\n", "Payment#", "Interest", "Principal", "Balance");

        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyInterestRate * balance;
            balance = balance - principal;
            // System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" +
            // balance);
            System.out.printf("%-10d%13.2f%13.2f%13.2f\n", i, interest, principal, balance);

        }
    }
}
