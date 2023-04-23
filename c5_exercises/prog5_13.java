public class prog5_13 {
    public static void main(String[] args) {
        System.out.println("Find the largest n such that n ** 2 < 12000");
        boolean _found = false;
        int _target = 12000;
        int _n = _target / 4; // beacuse thats how squares work.
        while (!_found) {
            if (Math.pow(_n, 2) <= 12000) {
                System.out.println(_n);
                _found = true;
            } else {
                _n--;
            }
        }

    }
}
