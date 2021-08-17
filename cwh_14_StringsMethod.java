package com.company;

public class cwh_14_StringsMethod {
    public static void main(String[] args) {

        String name = "Hunny";
        System.out.println(name.length());

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        String nonTrimedString = "    Hunny    ";
        System.out.println(nonTrimedString);

        System.out.println(nonTrimedString.trim());

        System.out.println(name.substring(3));

        System.out.println(name.substring(2,5));

        System.out.println(name.replace('n','p'));

        System.out.println(name.startsWith("hu"));
        System.out.println(name.endsWith("y"));

        System.out.println(name.charAt(2));

        String modefiedName = "Hunnynnynny";
        System.out.println(modefiedName.indexOf('n'));
        System.out.println(modefiedName.indexOf("nny",4));
        //Watch lec 14 for more deatails.

        System.out.println(modefiedName.lastIndexOf("nny",7));

        System.out.println(name.equals("Hunny"));
        System.out.println(name.equals("hunny"));

        System.out.println(name.equalsIgnoreCase("hunny"));
    }
}
