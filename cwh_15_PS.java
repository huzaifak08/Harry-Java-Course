package com.company;

public class cwh_15_PS {
    public static void main(String[] args) {
        //QUESTION 1:
        String name = "Hunny Khan";
        System.out.println(name.toLowerCase());

        //QUESTION 2:
        System.out.println(name.replace(" ","_"));

        //QUESTION 3:
        String letter = "Dear <|name|> , Thanks alot";
        letter = letter.replace("<|name|>","Hunny Khan");
        System.out.println(letter);

        //QUESTION 4:
        String mystring = "This contain double  and triple   spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
        //if any of the space is not available, it will return -1

        //QUESTION 5:
        String str = "Dear Hunny!\n\tThis java course is nice.\n\tThank you.";
        System.out.println(str);
    }
}
