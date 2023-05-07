public class prog6_23 {
    public static void main(String[] args) {
        System.out.println("Occurences of a specified character");
        System.out.println(count("mississippi", 's'));
    }

    public static int count(String str, char a) {
        int _counter = 0;
        for (char c : str.toCharArray()) {
            _counter += (c == a ? 1 : 0); // conditional if statement
        }
        return _counter;
    }
}
