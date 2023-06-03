import java.util.Random;
public class usingRandomClass {
    public static void main(String[] args) {
        Random random = new Random(3); // constructor for new random class with seed value
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(1000) + " ");
        }
        System.out.println(); // just an additional line.
        Random random1 = new Random(3); // constructor for new random1 class with same seed value
        for (int i = 0; i < 10; i++) {
            System.out.print(random1.nextInt(1000) + " ");
        }
    }
}
