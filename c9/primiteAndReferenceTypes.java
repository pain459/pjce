public class primiteAndReferenceTypes {
    public static void main(String[] args) {
        System.out.println("Testing difference between variables of primitive types" + 
            " and reference types");
        circle c1 = new circle();
        circle c2 = new circle();
        System.out.println("Details of c1");
        System.out.println(c1.r);
        System.out.println(c1.d);
        c1.r = 10;
        System.out.println(c1.r);
        System.out.println("Details of c2");
        System.out.println(c2.r);
        System.out.println(c2.d);
        // c2.r = c1.r;
        c2 = c1;
        System.out.println(c2.r);
        System.out.println(c2.d);
    }
}

class circle{
    int r = 2;
    int d = 4;

    circle(){       
    }
}
