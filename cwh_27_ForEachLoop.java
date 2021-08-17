package com.company;

public class cwh_27_ForEachLoop {
    public static void main(String[] args) {
/*
        float [] marks = {98.5f , 45.5f , 55.5f, 89.0f , 67.5f};
        String [] students = {"hunny", "harry" , "Broken"};
        System.out.println(students.length);
        System.out.println(students[2]);
*/
        int [] marks = {98,45,67,84,67};
        System.out.println(marks.length);
        System.out.println(marks[2]);

        //Display using naive way
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Display using for loop
        System.out.println("using for loop:");
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // Display in reverse order
        System.out.println("Reverse order..");
        for (int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        //Display using for each loop
        System.out.println("using for each loop");
        for (int element:marks){
            System.out.println(element);
        }
    }
}
