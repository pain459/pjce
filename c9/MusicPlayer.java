public class MusicPlayer {
    /** Default data */
    int mode = 1;  // Assuming this is default and listening only.
    int volume = 1;
    boolean blueTooth = false;
    boolean on = false;
    boolean pairing = false;
    boolean paired = false;

    /** Constructor */
    public MusicPlayer(){
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setMode(int newMode) {
        if (on && mode <= 4){
            mode = newMode;
        }
    }

    public void increaseVolume() {
        if (on && mode != 1 && volume < 10) {
            volume++;
        }
    }

    public void reduceVolume() {
        if (on && mode != 1 && volume > 0) {
            volume--;
        }
    }

    public void toggleBluetoothOn() {
        if (on && mode != 1) {
            blueTooth = true;
        }
    }

    public void toggleBluetoothOff() {
        if (on && mode != 1) {
            blueTooth = false;
        }
    }

    public void pairDevice() {
        if (on && blueTooth && mode != 1) {
            pairing = true;
            devicePaired();
        }
    }

    public void devicePaired() {
        if (pairing) {
            paired = true;
        }
    }
}
