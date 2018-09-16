//display system date and time using date class
package com.ar.collection;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {
    public static void main (String[] args) {
        Date date = new Date();

        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,Locale.US);

        String str = dateFormat.format(date);

        System.out.println(str);
    }
}
