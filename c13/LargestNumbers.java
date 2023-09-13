package c13;
import java.util.ArrayList;
import java.math.*;

public class LargestNumbers {
    public static void main(String[] args) {

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
