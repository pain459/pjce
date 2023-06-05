public class experimentNPE {
    public static void main(String[] args) {
        System.out.println("We will generate NPE using this program.");
        int a;
        int b;
        String x;
        boolean z;
        npeGenerator test1 = new npeGenerator();

        System.out.println("Printing " + test1.x);
        System.out.println("Printing " + test1.y);
        System.out.println("Printing " + test1.a);

        // Now running from local.
        // all 4 statements will give initialization errors. But not from the class.
        // System.out.println("Printing " + a);
        // System.out.println("Printing " + b);
        // System.out.println("Printing " + x);
        // System.out.println("Printing " + z);
    }
}


class npeGenerator {
    /** Data */
    int x;
    int y;
    String a;
    String b;

    // npeGenerator(){
    // }
}
