package com.company;

import java.util.Scanner;

public class cwh_82_Nested_Try_Catch {
    public static void main(String[] args) {

        int marks[] = new int[3];
        marks[0]= 7;
        marks[1]= 56;
        marks[2]= 6;

        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();

        try {
            System.out.println("welcome to video 82 ");
            try {
                System.out.println(marks[idx]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException occurs");
                System.out.println("Exception in Level 2");
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
