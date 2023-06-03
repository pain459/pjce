public class MusicPlayerRemote {
    /** Main method */
    public static void main(String[] args) {
        MusicPlayer sony1 = new MusicPlayer();
        sony1.turnOn();
        sony1.setMode(3);
        sony1.increaseVolume();
        sony1.increaseVolume();
        sony1.toggleBluetoothOn();
        sony1.pairDevice();
        // String isPaired = (sony1.paired ? "YES" : "NO");
        System.out.println(sony1.mode);
        System.out.println("Is pairing mode ON? " + sony1.pairing);
    }
}
