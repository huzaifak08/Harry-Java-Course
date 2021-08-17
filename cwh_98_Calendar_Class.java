package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class cwh_98_Calendar_Class {
    public static void main(String[] args) {

//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        //If you want to change timezone to another country use this method:
//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        //You can also get Id using this method:
//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone().getID());

        //If you want to get your Time zone id use this method:
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());




    }
}
