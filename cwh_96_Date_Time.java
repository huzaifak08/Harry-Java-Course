package com.company;

public class cwh_96_Date_Time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        // QUICK QUIZ: IS IT SAFE TO STORE NO. OF MILLISECONDS IN LONG?
        System.out.println(Long.MAX_VALUE);
        long a = System.currentTimeMillis();
        System.out.println(a);
    }
}
