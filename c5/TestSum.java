package c5;

public class TestSum {
    public static void main(String[] args) {
        float sum = 0;
        for (float i = 0.01f; i <= 1.0f ; i = i + 0.01f){
            sum += i;
        }
        System.out.println("The sum is " + sum);

        // performing the same with double 
        double sum_d = 0;
        for (double i_d = 0.01; i_d <= 1.0; i_d = i_d + 0.01) {
            sum_d += i_d;
        }
        System.out.println("The sum_d is " + sum_d);

        // Using integer loop

        double sum_i = 0;
        double currentValue = 0.01;
        for (int count = 0; count < 100; count++) {
            sum_i += currentValue;
            currentValue += 0.01;
        }

        System.out.println("The sum_i is " + sum_i);
    }
}
