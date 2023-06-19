package c11.SGOL;

public class TestOverload {
    public static void main(String[] args) {
        System.out.println("Testing overload");
        A1 a = new A1();
        a.p(10);
        a.p(10.0);
    }
}

class B1 {
    public void p (double i) {
        System.out.println(i * 2);
    }
}

class A1 extends B1 {
    // This method overloads the method in B1
    public void p (int i) {
        System.out.println(i);
    }
}
