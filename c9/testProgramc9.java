import java.util.Date;
public class testProgramc9 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date(); // constructor to use the date class.
        System.out.println("The elapsed time since Jan 1, 1970 is " 
            + date.getTime() + " milliseconds");
        System.out.println(date.toString());
    }
}
