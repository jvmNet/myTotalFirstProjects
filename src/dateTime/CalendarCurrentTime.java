package dateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarCurrentTime {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Calendar currentDate = Calendar.getInstance();

        try{
        currentDate.setTime(simpleDateFormat.parse(date));
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        Calendar startTime = Calendar.getInstance();
        startTime.set(startTime.getWeekYear(), 0, 0);

        long countDay = (currentDate.getTimeInMillis() - startTime.getTimeInMillis()) / (24 * 60 * 60 * 1000);

        if(countDay%2 != 0) return true;
            return false;
    }
}
