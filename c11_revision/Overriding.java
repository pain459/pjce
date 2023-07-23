package c11_revision;

public class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);

    }
}

class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A extends B {
    // This method overrides the method in B
    @Override  // We will mention this at the implementation to avoid mistakes while reading the code.
    public void p(double i) {
        System.out.println(i);
    }
}

