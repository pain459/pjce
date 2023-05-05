public class prog6_17 {
    public static void main(String[] args) {
        System.out.println("Display matrix of 0s and 1s");
        printMatrix(3);
    }

    public static void printMatrix(int n) {
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                System.out.printf("%s %s %s\n", (Math.random() * 10 > 5 ? 1 : 0), (Math.random() * 10 > 5 ? 1 : 0), (Math.random() * 10 > 5 ? 1 : 0));
                n--;
            }
        }
    }
}
