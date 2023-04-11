import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;

public class prog3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dictionary<String, Double> priceMap = new Hashtable<>();
        priceMap.put("r1", 2.5);
        priceMap.put("r2", 4.5);
        priceMap.put("r3", 10.5);
        System.out.print("Enter the weight: ");
        double w = input.nextDouble();
        // double w = 0, c = 0;
        if (w > 0 && w <= 2.0) {
            System.out.println("Cost of shipping $" + priceMap.get("r1"));
        } else if (w > 2.0 && w <= 4.0) {
            System.out.println("Cost of shipping $" + priceMap.get("r2"));
        } else if (w > 10.0 && w <= 20) {
            System.out.println("Cost of shipping $" + priceMap.get("r3"));
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
