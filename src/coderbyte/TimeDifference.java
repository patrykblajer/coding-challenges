package coderbyte;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

class TimeDifference {

    public static void main(String[] args) throws ParseException {
        System.out.println(timeDiff(new String[]{"2:10pm", "1:30pm", "10:30am", "4:42pm"}));
    }

    public static String timeDiff(String[] strArr) throws ParseException {
        Arrays.sort(strArr);
        SimpleDateFormat f = new SimpleDateFormat("hh:mmaa");
        long min = 60 * 24;
        for (int i = 0; i < strArr.length - 1; i++) {
            Date d1 = f.parse(strArr[i]);
            for (int j = i + 1; j < strArr.length; j++) {
                Date d2 = f.parse(strArr[j]);
                if (d2.compareTo(d1) < 0) {
                    d2 = new Date(d2.getTime() + 24 * 60 * 60 * 1000);
                }
                long sub = Math.abs((d2.getTime() - d1.getTime())) / (60 * 1000);
                min = Math.min(sub, min);
            }
        }
        return String.valueOf(min);
    }
}