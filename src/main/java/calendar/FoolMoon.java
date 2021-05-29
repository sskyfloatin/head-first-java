package calendar;
import java.util.Calendar;

import static java.lang.System.out;
public class FoolMoon {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2004,0,7,15,40,47);
        out.println(String.format("Полнолуние было в %tc",date));
        long day1 = date.getTimeInMillis();
        for (int x = 0; x < 3; x++) {
            day1 += DAY_IM * 29.52;
            date.setTimeInMillis(day1);
            out.println(String.format("Полнолуние было в %tc",date));
        }


    }
}
