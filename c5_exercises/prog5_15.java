public class prog5_15 {
    public static void main(String[] args) {
        System.out.println("Display the ascii character table.");
        int _start = 33;
        int _end = 126;
        int _counter = 0;
        for (int i = _start; i <= _end; i++) {
            _counter++;
            if (_counter == 10) {
                System.out.printf("%s\n", (char) i);
                _counter = 0;
            } else {
                System.out.printf("%s ", (char) i);
            }
        }
    }
}
