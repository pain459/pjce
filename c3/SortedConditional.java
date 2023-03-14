public class SortedConditional {
    public static void main(String[] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Now you have to enter 3 numbers. Enter space after each entry");

        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println((x < y && y < z) ? "sorted numbers" : "Not sorted");
    }
}