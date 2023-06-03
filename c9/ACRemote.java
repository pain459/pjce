public class ACRemote {
    /** Data fields */
    int temp = 24;
    boolean swing = false;
    boolean timer = false;
    int fan = 3; // max should be 5
    boolean on = false;
    //power config
    int power_mode = 0;
    int power_temp = 16;
    int power_fan = 5;
    boolean power_swing = true;

    /** constructor 1 */
    ACRemote() {
    }

    void powerON() {
        System.out.println("Temparature set to " + temp);
        String swing_status = (swing ? "ON" : "OFF");
        System.out.println("AC swing is " + swing_status);
        System.out.println("AC fan set to " + fan);
    }

    void powerON(int power_mode) {
        if (power_mode == 1) {
            System.out.println("Temparature set to " + power_temp);
            String swing_status = (power_swing ? "ON" : "OFF");
            System.out.println("AC swing is " + swing_status);
            System.out.println("AC fan set to " + power_fan);
        } else {
            System.out.println("BEEP! BEEP!");
        }        
    }
}
