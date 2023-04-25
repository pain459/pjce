public class prog5_24 {
    public static void main(String[] args) {
        int seriesLength = 98;
        double _result = 0;
        System.out.println("Sum a series. This is custom series.");
        // series is like this 1 / 2 + 3 / 4 + 5 / 6 + ....+ 95 / 96 + 97 / 98
        for (int i = 1; i <= seriesLength; i += 2) { // this will generate the series
                                                     // 135791113151719212325272931333537394143454749515355575961636567697173757779818385878991939597
            _result += i / i + 1;
        }
        System.out.println("Result : " + _result);
    }
}
