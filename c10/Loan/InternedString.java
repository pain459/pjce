package c10.Loan;

public class InternedString {
    public static void main(String[] args) {
        System.out.println("Testing java interned string feature.");
        String s1 = "Welcome to Java!";
        String s2 = new String("Welcome to Java!");
        String s3 = "Welcome to Java!";

        System.out.println("Is s1 == s2? " + (s1 == s2));
        System.out.println("Is s1 == s3? " + (s1 == s3));

    }
}
