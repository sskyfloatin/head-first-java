package calendar;

import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
        System.out.println("Time in miliseconds is " + day1);

        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("New time is " + c.get(c.HOUR_OF_DAY));

        c.add(c.DATE,35);
        System.out.println("Add 35 days " + c.getTime());

        c.roll(c.DATE, 35);
        System.out.println("Scroll 35 days " + c.getTime());

        c.set(c.DATE, 1);
        System.out.println("Set date in 1 " + c.getTime());

    }
}
