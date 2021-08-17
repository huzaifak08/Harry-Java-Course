package com.company;

import java.util.Scanner;

public class cwh_18_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your age from 18,25,35,45");
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You are teen age");
                break;
            case 25:
                System.out.println("You are adult");
                break;
            case 35:
                System.out.println("you are men");
                break;
            case 45:
                System.out.println("you are old");
                break;
            default:
                System.out.println("you are Dead");
        }
    }
}
