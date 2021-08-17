package com.company;

public class cwh_24_Break_Continue {
    public static void main(String[] args) {
        //break and continue using loop
/*        for (int i=0; i<50; i++){
            System.out.println(i + " java is great");
            if (i == 2) {
                System.out.println("Ending the loop...");
                break;
            }
        }

        int i=0;
        do {
            i++;
            System.out.println(i + " java is great");

            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }
        //continue Statement

            for(int i=0;i<50;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
               System.out.println(i);
                System.out.println("Java is great");
        }

        int i=0;
        while (i < 5) {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i + "Heart Broken Today");
        }*/

        int i=0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i + "Heart Broken Today");
        }while (i < 5);
    }
}
