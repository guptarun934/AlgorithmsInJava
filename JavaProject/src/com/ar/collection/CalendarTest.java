//To display system date and time
package com.ar.collection;

import java.util.Calendar;

public class CalendarTest {
    public static void main (String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.print("Current date:: ");
        int dd = cal.get(Calendar.DATE);
        int mm = cal.get(Calendar.MONTH);
        ++mm;
        int yy = cal.get(Calendar.YEAR);
        System.out.println(dd+"-"+mm+"-"+yy);
        System.out.print("Current Time::");
        int h = cal.get(Calendar.HOUR);
        int m = cal.get(Calendar.MINUTE);
        int s = cal.get(Calendar.SECOND);
        System.out.print(h+":"+m+":"+s);

        int x= cal.get(Calendar.AM_PM);
        if(x==0)
            System.out.println("Good Morning");
        else
            System.out.println("Good Evening");

    }
}
