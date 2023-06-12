package c9_exercises;

public class prog9_7 {
    public static void main(String[] args) {
        System.out.println("Account class program which returns emi details.");
        account a1 = new account(1, 25000);
        System.out.println(a1.getBalanceByID(1));
        a1.setDetails(1, 30000, 8.5);
        System.out.println(a1.getBalanceByID(1));
        System.out.println(a1.getAnnualInterestByID(1));
        System.out.println(a1.getMonthlyInterestRateByID(1));
    }
}

class account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    // no arg constructor for default account.
    account () {

    }
    account (int id, int balance) {
        this.id = id;
        this.balance = balance;
    }
    void setDetails (int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    double getBalanceByID (int id) {
        return balance;
    }
    double getAnnualInterestByID (int id) {
        return annualInterestRate;
    }
    double getMonthlyInterestRateByID (int id) {
        return annualInterestRate / 12;
    }
}