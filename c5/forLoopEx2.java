package c5;

public class forLoopEx2 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 0; sum < 10000; i++) {
            sum += i;
        }
        System.out.println("Current sum is " + sum);
    }
}
