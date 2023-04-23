public class prog5_18 {
    public static void main(String[] args) {
        System.out.println("Display 4 patte4rns using loops");
        int _i = 6;
        boolean loopEnds = false;
        String _sign = "* ";
        while (!loopEnds) {
            System.out.println("Pattern A");
            for (int j = 1; j <= _i; j++) {
                System.out.printf("%s\n", _sign.repeat(j));
            }
            System.out.println("Pattern B");
            for (int k = _i; k >= 1; k--) {
                System.out.println(_sign.repeat(k));
            }
            System.out.println("Pattern C");
            for (int l = 1; l <= _i; l++) {
                String _gap = String.valueOf(2 * _i);
                System.out.printf("%"+_gap+"s\n", _sign.repeat(l));
            }
            System.out.println("Pattern D");
            for (int m = _i; m >= 1; m--) {
                String _gap = String.valueOf(2 * _i);
                System.out.printf("%"+_gap+"s\n", _sign.repeat(m)); // constructing the printf dynamically with variables.
            }
            loopEnds = true;
        }
    }
}
