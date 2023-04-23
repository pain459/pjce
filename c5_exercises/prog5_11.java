public class prog5_11 {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 or 4 but not both");
        int counter = 0;
        for (int i = 100; i <= 1000; i++) {
            if ((i % 3 == 0 || i % 4 == 0) ^ (i % 3 == 0 && i % 4 == 0)) { // using the ^ xor operator
                counter++;
                if (counter == 10) {
                    System.out.printf("%d\n", i);
                    counter = 0;
                } else {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
