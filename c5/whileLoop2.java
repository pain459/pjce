package c5;

public class whileLoop2 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i < 10) {
            sum = sum + 1;
            i++;
            System.out.println(sum);
        }
        System.out.println("Sum is: " + sum);
    }
}
