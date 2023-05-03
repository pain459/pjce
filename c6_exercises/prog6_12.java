public class prog6_12 {
    public static void main(String[] args) {
        System.out.println("Display numbers");
        printNumbers(0, 100, 10);
    }

    public static void printNumbers(int num1, int num2, int numberPerLine) {
        int _counter = 1;
        for (int i = num1; i <= num2; i++) {
            if (_counter == numberPerLine) {
                System.out.printf("%4d\n", i);
                _counter = 1;
            } else {
                System.out.printf("%4d ", i);
                _counter++;
            }
        }
        // System.out.println("From method.");
    }
}
