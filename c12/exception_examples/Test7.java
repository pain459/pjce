package c12.exception_examples;

public class Test7 {
    public static void main(String[] args) {
        try {
            int n = 10;
            if (n < 20) {
                throw new Exception("Value too Small");
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block.");
    }
}
