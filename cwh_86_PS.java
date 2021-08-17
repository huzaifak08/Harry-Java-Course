package com.company;

import java.util.Scanner;

public class cwh_86_PS {
    public static void main(String[] args) {

        //PROBLEM 2:
        try {
            System.out.println(6/0);
        }
        catch (ArithmeticException e){
            System.out.println("HAHA");
        }
        catch (IllegalArgumentException e){
            System.out.println("HEHE");
        }

        //PROBLEM 3:

        boolean flag = true;
        int[] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;

        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;

        while (flag && i<5){
            try {
                System.out.println("Enter your index number");
                index=sc.nextInt();
                System.out.println("The value of marks[index] is "+ marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
            if (i>=5){
                System.out.println("ERROR");
            }
        }
    }

}
