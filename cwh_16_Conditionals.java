package com.company;
import java.util.Scanner;

public class cwh_16_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age>18){
            System.out.println("Yes buddy you can drive..");
        }
        else {
            System.out.println("No baby you cant drive now...");
        }
    }
}
