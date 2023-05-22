public class testing1 {
    public static void main(String[] args) {
        System.out.println("Test program");
        printArray(new int[] { 1, 2, 3, 4, 5 });
        loopTesting();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void loopTesting() {
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);
        }
    }
}
