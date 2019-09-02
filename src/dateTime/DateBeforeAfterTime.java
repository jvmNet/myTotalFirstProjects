package dateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DateBeforeAfterTime {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        //напишите тут ваш код

        long isBeforeTime = new Date().getTime();

        insert10000(list);

        //напишите тут ваш код

        long isAfterTime = new Date().getTime();

        long isDelay = isAfterTime - isBeforeTime;

        return isDelay;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
