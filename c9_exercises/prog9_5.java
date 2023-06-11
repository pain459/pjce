package c9_exercises;
import java.util.GregorianCalendar;

public class prog9_5 {
    public static void main(String[] args) {
        System.out.println("Program to explore Gregorian calendar");
        calendarClass c1 = new calendarClass();
        c1.currentDate();
        c1.timeInMilliSeconds = 1234567898765L;
        System.out.println(c1.convertMillis().toZonedDateTime());
    }
}

class calendarClass {
    GregorianCalendar c = new GregorianCalendar();
    long timeInMilliSeconds;

    calendarClass() {
    }
    void currentDate() {
        System.out.println("Current date is : " + c.get(GregorianCalendar.MONTH) + "/" + c.get(GregorianCalendar.DATE) + "/" + c.get(GregorianCalendar.YEAR));
    }

    GregorianCalendar convertMillis() {
        c.setTimeInMillis(timeInMilliSeconds);
        return c;
    }
}
