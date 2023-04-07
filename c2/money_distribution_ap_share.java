import java.util.Scanner;

public class money_distribution_ap_share{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the total money disbursed (in crores): ");
		double disbursed_amount = input.nextDouble();

		System.out.print("Enter the total number of benificiaries (in lakhs): ");
		double total_benificieries = input.nextDouble();

		double per_person_share = (disbursed_amount * 1_000_000_00) / (total_benificieries * 1_000_00);
		System.out.printf("Amount credited per person is: %.2f\n", per_person_share);
	}
}