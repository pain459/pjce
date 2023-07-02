package c10_revision;

public class HomeLoan {
    private long loanAmount;
    private int tenure;
    private double annualInterestRate;

    /** Default constructor */
    public HomeLoan() {
        this(100000, 1, 0.5);
    }

    /** Construct a loan with specified annual interest rate
     * number of years, and loan amount */

    public HomeLoan(long loanAmount, int tenure, double annualInterestRate) {
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.annualInterestRate = annualInterestRate;
    }

    /** Getter methods */
    public void getLoanDetails() {
        System.out.println("Current loan amount is: " + loanAmount);
        System.out.println("Set tenure is: " + tenure);
        System.out.println("Offered annual interest  is: " + annualInterestRate);
    }

    /** Setter methods */
    public long setLoanAmount(long loanAmount) {
        this.loanAmount = loanAmount;
        return 0;
    }

    public int setTenure(int tenure){
        this.tenure = tenure;
        return 0;
    }

    public double setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        return 0;
    }

    /** get the monthly emi details */
    public double getMonthlyEmi() {
        double monthlyRateOfInterest = this.annualInterestRate / 12 / 100;
        double monthlyEmi = this.loanAmount * monthlyRateOfInterest * Math.pow((1 + monthlyRateOfInterest), this.tenure * 12) / (Math.pow((1 + monthlyRateOfInterest), this.tenure * 12) - 1);
        return Math.round(monthlyEmi); // Returning nearest double with Math.round
    }

    /** Get the total amount payable with interest */
    public long getTotalAmountPayable() {
        return Math.round((long) getMonthlyEmi() * this.tenure * 12);
    }

    public void getAmortizationScheduleYearly() {
        System.out.printf("%-10s %-25s %-15s %-25s\n", "Year", "Opening Balance", "EMI*12", "Yearly Interest");
        for (int i = 1; i <= this.tenure; i++) {
            double openingBalance = this.getTotalAmountPayable() - (this.getMonthlyEmi() * this.tenure * (i - 1));
            System.out.printf("%-10s %-25s %-15s %-25s\n", i, openingBalance, this.getMonthlyEmi(), this.annualInterestRate);
        }
    }

}
