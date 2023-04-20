import java.util.*;
public class prog4_25 {
    public static void main(String[] args) {
        System.out.println("Generate vehicle plate numbers");
        Random r = new Random();
        char _c1 = (char) (r.nextInt(26) + 'A');
        char _c2 = (char) (r.nextInt(26) + 'A');
        char _c3 = (char) (r.nextInt(26) + 'A');
        int _n1 = (int) (Math.random() * 10);
        int _n2 = (int) (Math.random() * 10);
        int _n3 = (int) (Math.random() * 10);
        int _n4 = (int) (Math.random() * 10);
        System.out.println("Random registration number is: " + _c1 + _c2 + _c3 + " " + _n1 + _n2 + _n3 + _n4);
    }
}
