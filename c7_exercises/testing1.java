public class testing1 {
    public static void main(String[] args) {
        System.out.println("Test program");
        printArray(new int[] { 1, 2, 3, 4, 5 });
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
