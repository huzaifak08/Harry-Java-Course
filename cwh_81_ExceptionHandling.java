package com.company;

import java.util.Scanner;

public class cwh_81_ExceptionHandling {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array index");
        int idx = sc.nextInt();

        System.out.println("Enter the number you want to divide with the value");
        int num = sc.nextInt();

        try {
            System.out.println("The value of array index entered is "+ marks[idx]);
            System.out.println("The value of array-value/number is "+ marks[idx]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured");
        }
    }
}
