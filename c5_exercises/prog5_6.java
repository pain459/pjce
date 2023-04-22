public class prog5_6 {
    public static void main(String[] args) {
        System.out.printf("Converstion from Square meter to ping\n");
        int chartLimit = 0;
        System.out.println("Ping  Square meter  |  Square meter  Ping");
        while (chartLimit <= 10) {
            double _temp = (double) chartLimit;
            double _c = _temp;
            double _f = _c * 9 / 5 + 32;
            System.out.printf("%-4s  %12s  |  %-12s  %4s\n", _c, _f, _f, _c); // logic to be fixed for pings. 1 ping
            chartLimit++;
        }
    }
}
