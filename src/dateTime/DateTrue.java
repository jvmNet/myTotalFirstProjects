package dateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTrue {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));

    }

    public static boolean isDateOdd(String date) {
        Date startTime = new Date(date);
        startTime.setHours(0);
        startTime.setMinutes(0);
        startTime.setSeconds(0);
        startTime.setDate(1);
        startTime.setMonth(0);

        Date currentTime = new Date(date);

        long msDistance = currentTime.getTime() - startTime.getTime();
        long countDay = msDistance / (24 * 60 * 60 * 1000);

        if((countDay + 1)%2 == 0){
            return false;
        }else {
              return true;
        }
    }
}


