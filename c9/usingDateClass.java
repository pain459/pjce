import java.util.Date;
public class usingDateClass {
    public static void main(String[] args) {
        Date date = new Date(); // constructor to use the date class. Just like scanner.
        System.out.println("The elapsed time since Jan 1, 1970 is " 
            + date.getTime() + " milliseconds");
        System.out.println(date.toString());
        Date date1 = new Date(System.currentTimeMillis() + 100); // trying to use date.compareTo in the next statement.
        System.out.println(date.compareTo(date1)); // returns -1 as current date is less than date + 1000
    }
}
