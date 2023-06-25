package c9_revision;

public class VisibilityModifierDemo {
    public static void main(String[] args) {
        System.out.println("This is a visibility modifier demo");
        p1 test1 = new p1();
        test1.overRidingz(10);
    }
}

class p1 {
    private int x;
    int y;
    public int z;

    public void setx(int x) {
        this.x = x;
    }

    void sety(int y) {
        this.y = y;
    }

    private void setz(int z) {
        this.z = z;
    }

    public void overRidingz(int z) {
        setz(z);
    }
}

class p2 {
    p1 test1 = new p1();
    void testing () {
        test1.z = 10; // can access from above class.
    }
}