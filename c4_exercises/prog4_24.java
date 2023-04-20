import java.util.*;
public class prog4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Order three countries.");
        System.out.print("Enter 3 country names: ");
        String _c1 = input.next();
        String _c2 = input.next();
        String _c3 = input.next();
        ArrayList<String> _result = new ArrayList<String>();
        _result.add(_c1);
        _result.add(_c2);
        _result.add(_c3);
        Collections.sort(_result, Collections.reverseOrder());
        System.out.println("Three countries in descending order are " + _result.get(0) + " " + _result.get(1) + " " + _result.get(2));
    }
}
