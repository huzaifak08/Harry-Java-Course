package com.company;

public class cwh_80_Try_Catch {
    public static void main(String[] args) {

        int a = 6000;
        int b = 0;

        //Without Try_Catch:
//        int c = a/b;
//        System.out.println(c);

        //With Try_Catch:
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("We are failed Reason:");
            System.out.println(e);
        }
        System.out.println("Program Ends Here");
    }
}
