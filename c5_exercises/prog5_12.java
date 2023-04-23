public class prog5_12 {
    public static void main(String[] args) {
        System.out.println("Find the smallest n such that n**3 > 12000");
        boolean _found = false;
        int _n = 0;
        while (!_found) {
            if (Math.pow(_n, 3) >= 12000) {
                System.out.println(_n);
                _found = true;
            } else {
                _n++;
            }
        }
    }
}
