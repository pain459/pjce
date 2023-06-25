package c9_revision;

public class DaikinRemote {
    boolean powerChill = false; // defaulting to false for economic purposes
    boolean on = false; // AC shouldn't be ON by default.
    int temp = 26; // setting default temp.
    int fan = 3; // defaulting to 3. Max till 6.
    boolean swing = false; // no swing by default
    boolean economicMode = false; // Defaulting to false. This mode should have a different set of values.
    boolean timer = false; // No timer by default.
    int timer_hh = 0, timer_mm = 0;

    DaikinRemote() {
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public void increaseTemp() {
        if (on) {
            temp++;
        }
    }
    public void decreaseTemp() {
        if (on) {
            if (temp >= 14) {
                temp--;
            }
        }
    }

    public void swingOn() {
        if (on) {
            swing = true;
        }
    }

    public void swingOff() {
        if (on) {
            swing = false;
        }
    }

    public void getCurrentSettings() {
        if (on) {
            String acStatus = on ? "ON" : "OFF";
            System.out.println("AC is " + acStatus);
            System.out.println("PowerChill is " + powerChill);
            System.out.println("Temperature is " + temp);
            System.out.println("Fan speed is " + fan);
            System.out.println("Swing is " + swing);
            System.out.println("Economic mode is " + economicMode);
            System.out.println("Timer is " + timer);
        } else {
            System.out.println("Please turn on the AC first");
        }
    }

    public void timerOn() {
        if (on) {
            timer = true;
        }
    }

    public void timerOff() {
        if (on) {
            timer = false;
            timer_hh = 0;
            timer_mm = 0;
        }
    }
    public void setTimer(int hh, int mm) {
        timerOn();
        if (hh >= 0 && mm > 0) {
            timer_hh = hh;
            timer_mm = mm;
        }
    }
}
