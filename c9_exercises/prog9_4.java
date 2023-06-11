package c9_exercises;
import java.util.Random;

public class prog9_4 {
    public static void main(String[] args) {
        System.out.println("Using random class and seed.");
        randomNumberGenerator r1 = new randomNumberGenerator(100, 100, 49);
        r1.randomNumberWithSeed();
    }
}

class randomNumberGenerator {
    int seed;
    int firstRandomIntegers;
    final int rangeLowerLimit = 1; // we shouldn't change this limit
    int rangeUpperLimit;

    randomNumberGenerator(int seed, int firstRandomIntegers, int rangeUpperLimit) {
        this.seed = seed;
        this.firstRandomIntegers = firstRandomIntegers;
        this.rangeUpperLimit = (Math.max(rangeUpperLimit, 1));
    }
    void randomNumberWithSeed () {
        Random random = new Random(this.seed);
        for (int i = 1; i <= rangeUpperLimit; i++) {
            System.out.print(" " + random.nextInt(this.rangeUpperLimit));
        }
    }
}
