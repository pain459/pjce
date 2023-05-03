public class prog6_11 {
    public static void main(String[] args) {
        System.out.println("Financial application: Compute commissions");
        System.out.println("We will generate one time table for sales and commission upto 100000 from 10000 incrementing by 5000");
        System.out.println(computeCommission(100000));
    }


    // Sales scheme
    // sales amount    Commission rate
    //--------------------------------
    //0.01 - 5000      6%
    //5000.01-10000    8%
    //10000.0 and above 10%
    public static double computeCommission(double salesAmount){
        double _start = 10000;
        double _increment = 5000;
        double _target = 0.0;
        return 0;
    }
}
