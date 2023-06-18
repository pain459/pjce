package c9_exercises;

public class prog9_8 {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate fan class.");
        fan f1 = new fan();
        fan f2 = new fan();
        f1.setFanParams(2, "red", 6.5, true);
        f2.setFanParams(1, "blue", 9.5, false);
        f1.updateParams(6);
        f1.updateParams("white");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}

class fan {
    private static int SLOW = 1;
    private static int MEDIUM = 2;
    private static int HIGH = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";
    fan(){
    }

    void setFanParams(int speed, String color, double radius, boolean on) {
        this.speed = speed;
        this.color = color;
        this.radius = radius;
        this.on = on;
        System.out.println("Data updated successfully.");
    }

    void updateParams(int speed) {
        this.speed = speed;
    }
    void updateParams(String color) {
        this.color = color;
    }
    void updateParams(double radius) {
        this.radius = radius;
    }
    void updateParams(boolean on) {
        this.on = on;
    }

    public String toString() {
        if (this.on) {
            return "The fan of " + this.color + " with "+ this.radius + " at " +  this.speed + " speed is on.";
        } else {
            return "The fan is off.";
        }
    }
}
