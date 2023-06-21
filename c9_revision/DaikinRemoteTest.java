package c9_revision;

public class DaikinRemoteTest {
    public static void main(String[] args) {
        System.out.println("Testing the Daikin remote");
        DaikinRemote r1 = new DaikinRemote();
        r1.turnOn();
        r1.increaseTemp();
        r1.increaseTemp();
        for (int i = 0; i <= 10; i--) {
            r1.decreaseTemp();
        }
        r1.getCurrentSettings();
    }
}
