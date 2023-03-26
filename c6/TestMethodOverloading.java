package c6;

public class TestMethodOverloading {
    public static void main(String[] args) {
        System.out.println("The max of 4 and 5 is: " + max(4, 5));
        System.out.println("The max of 4.0 and 5.0 is " + max(4.0, 5.0));
        System.out.println("The max of 4.0, 5.0 & 6.0 is " + max(4.0, 5.0, 6.0));
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    public static double max(double num1, double num2, double num3) {
        return (max(max(num1, num2), num3));
    }
}
