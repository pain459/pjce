package c9_exercises;

public class prog9_6 {
    public static void main(String[] args) {

        System.out.println("Stopwatch program in JAVA");
        stopWatch s1 = new stopWatch();
        s1.start();
        System.out.println("Sleeping for 5 seconds.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Handle if sleep is interrupted
            e.printStackTrace();
        }
        System.out.println("After sleep.");
        s1.stop();
        System.out.println("Time taken for execution in ms: " + s1.getElapsedTime());

    }
}

class stopWatch {
    private long startTime;
    private long endTime;

    long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}