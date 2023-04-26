public class prog5_27 {
    public static void main(String[] args) {
        System.out.println("Display leap years");
        int _counter = 0;
        int _total = 0;
        for (int i = 2014; i <= 2114; i++ ) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) { // leap year condition
                _total++; // total leap year counter
                if (_counter == 10) {
                    System.out.printf("%d\n", i);
                    _counter = 0;
                }
                System.out.printf("%d ", i);
                _counter++; // format counter
            }
        }
        System.out.println("\nTotal leap years between 2014 & 2114 are " + _total);

    }
}


// if (_year % 400 == 0 || (_year % 4 == 0 && _year % 100 != 0))