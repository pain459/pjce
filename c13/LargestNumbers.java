package c13;
import java.util.ArrayList;
import java.math.*;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(35);
        list.add(258.65);
        list.add(new BigInteger("556858859658485485"));
        list.add(new BigDecimal("3.2252114521452256"));

        System.out.println("The biggest number in the queue is " + getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }
        return number;
    }
}
