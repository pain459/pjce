package c6;

public class TestPassByValue {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        System.out.println("Numbers before invoking swap method, num1 is " + n1 + " and num2 is " + n2);
        swap(n1, n2);
        System.out.println("After invoking the swap method, num1 is " + n1 + " and num2 is " + n2);
    }

    public static void swap(int i1, int i2) {
        System.out.println("\tThis is inside the swapping method.");
        int temp = i1;
        i1 = i2;
        i2 = temp;

        System.out.println("\tAfter swapping, num1 is " + i1 + " and num2 is " + i2);
    }
}