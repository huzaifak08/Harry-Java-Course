package com.company;

import java.util.Date;

public class cwh_97_Date_Class {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());

        //DEPRICATED METHODS:
        System.out.println(d.getDate());
        System.out.println(d.getHours());
    }
}
