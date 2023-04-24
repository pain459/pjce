public class prog5_21 {
    public static void main(String[] args) {
        System.out.println("Financial application: compare loans with various interest rates");
        int loanAmount = 10000;
        int numberOfYears = 5;
        double annualInterestRate = 5.0;
        String _symbol = "%";
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.printf("Interest Rate        Monthly Payment        Total Payment\n");
        while (annualInterestRate != 10.250) {
            double monthlyPayment = loanAmount * monthlyInterestRate
                    / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%-7.3f%" + _symbol + "%25.2f%25.2f\n", annualInterestRate, monthlyPayment, totalPayment);
            annualInterestRate += 0.25;
            monthlyInterestRate = annualInterestRate / 1200;
        }
    }
}