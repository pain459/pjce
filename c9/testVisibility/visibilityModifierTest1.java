package testVisibility;

public class visibilityModifierTest1 {
    public static void main(String[] args) {
        visibilityModifier t1 = new visibilityModifier();
        System.out.println(t1.x);
        System.out.println(t1.y);
//        System.out.println(t1.z); // cannot print this due to private access.
        System.out.println(t1.a);  // a should be accessible as it used in the same class where it is private.
    }
}
