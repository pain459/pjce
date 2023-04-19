import java.util.*;

public class prog4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student major and status");
        System.out.print("Enter two characters (Combination of I,C,A and 1,2,3,4): ");
        String _input = input.nextLine();
        List<Character> _group = new ArrayList<Character>();
        _group.addAll(Arrays.asList('I', 'C', 'A'));
        List<Integer> _class = new ArrayList<Integer>();
        _class.addAll(Arrays.asList(1, 2, 3, 4));
        if (_group.contains(_input.charAt(0)) && _class.contains(Character.getNumericValue(_input.charAt(1)))
                && _input.length() == 2) {
            // System.out.println("Valid input.");
            ;
        } else {
            System.out.println("Invalid input.");
        }

        Dictionary<Character, String> _classifier = new Hashtable<>(7);
        _classifier.put(_group.get(0), "Information Management");
        _classifier.put(_group.get(1), "Computer Science");
        _classifier.put(_group.get(2), "Accounting");
        _classifier.put('1', "freshman");
        _classifier.put('2', "sophomore");
        _classifier.put('3', "junior");
        _classifier.put('4', "Senior");

        // parse the output
        System.out.println(_classifier.get(_input.charAt(0)) + " " + _classifier.get(_input.charAt(1)));

    };
}
