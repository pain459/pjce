package c12.exception_examples;

public class SimpleNPE {
    public static void main(String[] args) {
        Object n = null;
        try {
            System.out.println(n.toString());
        } catch (NullPointerException ex) {
            System.out.println("NPE demo.");
        }
    }
}
