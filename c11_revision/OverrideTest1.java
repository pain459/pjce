package c11_revision;

public class OverrideTest1 {
    public static void main(String[] args) {
        Y table2 = new Y();
        table2.displayTable(2);
        Y table3 = new Y();
        table3.displayTable(2);
        Z table4 = new Z();
        table4.displayTable(10);
    }
}

class X {
    public void displayTable(int i) {
        for (int j = 1; j <= 5; j++) {
            System.out.println(i + " x " + j + " = " + (i * j));
        }
    }
}

class Y extends X {
    @Override
    public void displayTable(int i) {
        for (int j = 5; j >= 1; j--) {
            System.out.println(i + " x " + j + " = " + (i * j));
        }
    }
}

class Z extends X {
    public void displayTable(double i) {
        for (int j = 5; j >= 1; j--) {
            System.out.println(i + " x " + j + " = " + (i * j));
        }
    }
}