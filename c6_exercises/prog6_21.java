import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prog6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Phone Keypads");
        System.out.println("Enter the encoded phone number to decode: ");
        String _input = input.next();
        System.out.println(cleanNumber(_input));
    }

    public static String cleanNumber(String userInput) {
        String finalOutput = "";
        for (char c : userInput.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                finalOutput += keysMapping(c);
            } else {
                finalOutput += c;
            }
        }
        return finalOutput;
    }

    public static int keysMapping(char _check) {
        List<Character> Key2 = new ArrayList<Character>();
        Key2.addAll(Arrays.asList('A', 'B', 'C', 'a', 'b', 'c'));
        List<Character> Key3 = new ArrayList<Character>();
        Key3.addAll(Arrays.asList('D', 'E', 'F', 'd', 'e', 'f'));
        List<Character> Key4 = new ArrayList<Character>();
        Key4.addAll(Arrays.asList('G', 'H', 'I', 'g', 'h', 'i'));
        List<Character> Key5 = new ArrayList<Character>();
        Key5.addAll(Arrays.asList('J', 'K', 'L', 'j', 'k', 'l'));
        List<Character> Key6 = new ArrayList<Character>();
        Key6.addAll(Arrays.asList('M', 'N', 'O', 'm', 'n', 'o'));
        List<Character> Key7 = new ArrayList<Character>();
        Key7.addAll(Arrays.asList('P', 'Q', 'R', 'S', 'p', 'q', 'r', 's'));
        List<Character> Key8 = new ArrayList<Character>();
        Key8.addAll(Arrays.asList('T', 'U', 'V', 't', 'U', 'V'));
        List<Character> Key9 = new ArrayList<Character>();
        Key9.addAll(Arrays.asList('W', 'X', 'Y', 'Z', 'w', 'x', 'y', 'z'));
        // loop to check the existence.
        List<Integer> _numbers = new ArrayList<Integer>();
        _numbers.addAll(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9));
        if (Key2.contains(_check)) {
            return _numbers.get(0);
        } else if (Key3.contains(_check)) {
            return _numbers.get(1);
        } else if (Key4.contains(_check)) {
            return _numbers.get(2);
        } else if (Key5.contains(_check)) {
            return _numbers.get(3);
        } else if (Key6.contains(_check)) {
            return _numbers.get(4);
        } else if (Key7.contains(_check)) {
            return _numbers.get(5);
        } else if (Key8.contains(_check)) {
            return _numbers.get(6);
        } else if (Key9.contains(_check)) {
            return _numbers.get(7);
        } else {
            return -1;
        }
    }
}