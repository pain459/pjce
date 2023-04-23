public class prog5_10 {
    public static void main(String[] args) {
        System.out.println("Find numbers divisible by 3 and 4");
        int counter = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
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
