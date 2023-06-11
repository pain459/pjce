public class thisKeyWordDemo {
    public static void main(String[] args) {
        testingThis t = new testingThis();
        System.out.println(t.returnField1());
        System.out.println(t.returnField2());
    }
}

class testingThis {
    int x = 1;
    double y = 2;
    testingThis(){
    }

    int returnField1() {
        return this.x;
    }

    double returnField2() {
        return this.y;
    }

}