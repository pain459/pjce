package c9_exercises;
import java.util.Date;

public class prog9_3 {
    public static void main(String[] args) {
//        Date date = new Date();
//        long milliseconds = 120000000000L;
//        date.setTime(milliseconds);
//        System.out.println(date.toString());
        dateClass outPut1 = new dateClass();
        outPut1.convertTimeFromMilliSeconds();
    }
}

class dateClass{
    long[] dateInMilliSeconds = new long[7];
    long milliSeconds = 12000L;
    long[] stencil = new long[7];

    dateClass(){
    }
    long[] constructArray() {
        int range = 7;
        stencil = new long[]{1L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L};
        for (int i = 0; i < range; i++) {
            dateInMilliSeconds[i] = milliSeconds * stencil[i];
        }
        return dateInMilliSeconds;
    }

    void convertTimeFromMilliSeconds(){
        Date d1 = new Date();
        dateClass conv1 = new dateClass();
        long[] dateInMillis = conv1.constructArray();
        for (int i = 0; i < 7; i++) {
            d1.setTime(dateInMillis[i]);
            System.out.println("Time elapsed is " + d1.toString());
        }
    }
}