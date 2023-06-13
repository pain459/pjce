package c9_exercises;

public class prog9_10 {
    public static void main(String[] args) {
        System.out.println("Algebra: Quadratic equations");
        quadraticEquation q1 = new quadraticEquation(1, -5, 6);
        quadraticEquation q2 = new quadraticEquation(3, 6, 2);
        System.out.println(q1.getDiscriminant());
        System.out.println(q2.getDiscriminant());
        System.out.println(q1.getRoot1());
        System.out.println(q1.getRoot2());
        System.out.println(q2.getRoot1());
        System.out.println(q1.getRoot2());
    }
}

class quadraticEquation {
    private double a;
    private double b;
    private double c;

    quadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return this.a;
    }
    double getB() {
        return this.b;
    }
    double getC() {
        return this.c;
    }

    double getDiscriminant() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    double getRoot1() {
        if (getDiscriminant() > 0) {
            return (-this.b + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
//            return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        } else {
            return 0;
        }
    }

    double getRoot2() {
        if (getDiscriminant() > 0) {
            return (-this.b - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
        } else {
            return 0;
        }
    }
}