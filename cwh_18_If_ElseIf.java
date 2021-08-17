package com.company;
import java.util.Scanner;

public class cwh_18_If_ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age > 68) {
            System.out.println("You are well experienced..");
        }
        else if (age > 58){
            System.out.println("you are experienced..");
        }
        else if (age> 25){
            System.out.println("You are learning..");
        }
        else {
            System.out.println("You are a baby...");
        }
    }
}
