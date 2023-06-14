package c10.Loan;

public class useBMIClass {
    public static void main(String[] args) {
        System.out.println("Using BMI class in this program.");
        BMI bmi1 = new BMI("RRR", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
            + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("SSS", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
                + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
