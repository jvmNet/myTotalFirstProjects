package dateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDate {
    public static void main(String[] args) {

        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("NOVEMBER 30 2017"));

    }

    public static boolean isDateOdd(String date) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd yyyy");
        Calendar currentDate = Calendar.getInstance();

        try {
        currentDate.setTime(simpleDateFormat.parse(date));
        } catch (java.text.ParseException error) {
            error.getMessage();
        }

        Calendar startDate = Calendar.getInstance();
        startDate.set(currentDate.getWeekYear(), 0, 0);

        long countDay = (currentDate.getTimeInMillis() - startDate.getTimeInMillis()) / (24 * 60 * 60 * 1000) + 1;

        System.out.println(countDay);

        return true;

    }
}
