package testVivibilityPart2;

import testVisibility.visibilityModifier;

public class visibilityModifierTest2 {
    public static void main(String[] args) {
        visibilityModifier t2 = new visibilityModifier();
        System.out.println(t2.a);
        System.out.println(t2.x);
        // cannot access anything else due to visibility restrictions.
    }
}
