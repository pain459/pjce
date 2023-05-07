
// import java.text.DateFormat;
// import java.text.SimpleDateFormat;
// import java.util.Calendar;
import java.util.Date;

public class prog6_24 {
    public static void main(String[] args) {
        System.out.println("Display current date and time.");
        displayDateTime();
    }

    public static void displayDateTime() {
        long currentTime = System.currentTimeMillis();
        Date currentDate = new Date(currentTime);
        System.out.println(currentDate);
    }
}
