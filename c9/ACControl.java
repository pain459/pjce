public class ACControl {
    /** main method */
    public static void main(String[] args) {
        System.out.println("User will control AC now.");
        ACRemote ac1 = new ACRemote();
        ACRemote ac2 = new ACRemote();
        ACRemote ac3 = new ACRemote();
        System.out.println("Turning AC1 ON");
        ac1.powerON();
        System.out.println("Turning AC2 ON in power mode");
        ac2.powerON(1);
        System.out.println("Turning AC3 ON with invalid option");
        ac3.powerON(5);
    }
}
