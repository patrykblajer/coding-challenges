package codewars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class CountingMinutes {
    public static void main(String[] args) throws ParseException {
        System.out.println(countingMinutes("12:30pm-12:00am"));
        System.out.println(countingMinutes("1:23am-1:08am"));
    }

    public static String countingMinutes(String str) throws ParseException {
        String[] parts = str.split("-");
        SimpleDateFormat date = new SimpleDateFormat("hh:mmaa");
        final int dayInMilliseconds = 1000 * 60 * 60 * 24;

        Date d1 = null;
        Date d2 = null;

        d1 = date.parse(parts[0]);
        d2 = date.parse(parts[1]);

        if (d2.compareTo(d1) < 0) {
            d2 = new Date(d2.getTime() + dayInMilliseconds);
        }

        long diff = d2.getTime() - d1.getTime();

        return Long.toString(TimeUnit.MILLISECONDS.toMinutes(diff));
    }
}