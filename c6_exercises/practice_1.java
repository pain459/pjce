public class practice_1 {

    public static int max(int a, int b) {
        int result;
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(20, 20));
    }
}
