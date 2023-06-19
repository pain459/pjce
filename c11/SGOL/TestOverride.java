package c11.SGOL;

public class TestOverride {
    public static void main(String[] args) {
        System.out.println("Testing override.");
        A a = new A();
        a.p(10);
        a.p(10.0);
        // B should work as expected.
        B b = new B();
        b.p(10);
        b.p(10.0);
        C c = new C();
        c.p(10);
        c.p(10.5);
    }
}

class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A extends B {
    // This method overrides the method in B
    public void p(double i) {
        System.out.println(i);
    }
}

class C extends A {
    // Testing override in another way
    // extending from A
    public void p (int i) {
        System.out.println("Coming from class C");
    }
}