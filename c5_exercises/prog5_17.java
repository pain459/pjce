public class prog5_17 {
    public static void main(String[] args) {
        int _i = 7;
        while (_i != 0) {
            int _temp = _i;
            for (int j = _temp; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= _temp; k++) {
                System.out.print(k + " ");

                }
            System.out.println(" ");
            _i--;
        }
    }
}
