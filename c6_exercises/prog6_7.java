public class prog6_7 {
    public static void main(String[] args) {
        System.out.println("Financial application: Compute the future investment");
        // System.out.print(futureInvestment(10000, 0.05 / 12, 5));
        investmentCalculator(1000, 0.09 / 12, 10);
    }

    public static void investmentCalculator(double investmentAmount, double monthlyInterestRate, int years) {
        System.out.println("Total amount invested: " + investmentAmount);
        System.out.println("Annual interest rate: " + monthlyInterestRate * 12);
        System.out.println("Years      Future Value");
        double perYearValue = 0;
        for (int i = 1; i <= years; i++) {
            System.out.printf("%-5d      %12.2f\n", i,
                    perYearValue += futureInvestment(investmentAmount, monthlyInterestRate, i));
            // perYearValue += futureInvestment(investmentAmount, monthlyInterestRate, i);
        }
    }

    public static double futureInvestment(double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
        return futureInvestmentValue;
    }

    public static double yearlyInterest(double investmentAmount, double monthlyInterestRate, int years) {

        return 0;
    }
}
