package lib_local;

public class timingOperations {
    public static void totalTimeTakenInMillis(long startTime, long stopTime, String task) {
        long timeTaken = stopTime - startTime;
        System.out.println("Total time taken for " + task + " is " + timeTaken + " milliseconds");
    }
}
