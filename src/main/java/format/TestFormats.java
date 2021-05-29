package format;

import java.util.Calendar;
import java.util.Date;

import static java.lang.String.format;

public class TestFormats {


    public static void main(String[] args) {
        String s = format("%,d",1000000000);
        System.out.println(s);

        String s1 = "2";
        int x = Integer.parseInt(s1);
        System.out.println(x);

        double d = 42.5;
        String doubleString = Double.toString(d);
        String doubleString2 = "" + d;
        System.out.println(doubleString2);

        boolean b = new Boolean("true").booleanValue();
        System.out.println(b);

        System.out.println(format("I need correct %.2f errors", 476578.09876));
        System.out.println(format("I need correct %,.2f errors", 476578.09876));
        System.out.println(format("%,6.1f", 42.000));
        System.out.println(format("%d", 42));
        System.out.println(format("%x", 42));
        System.out.println(format("%c", 42));

        int one = 20456654;
        double two = 100567890.248907;
        String s2 = String.format("Degree %,d from %,.2f", one, two);
        System.out.println(s2);

        String date = String.format("%tc", new Date());
        System.out.println(date);
        String date2 = String.format("%tr", new Date());
        System.out.println(date2);

        Date today = new Date();
        String.format("%tA, %<tB %<td",today);
        System.out.println(today);

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
