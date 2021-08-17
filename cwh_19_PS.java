package com.company;
import java.util.Scanner;

public class cwh_19_PS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        //QUESTION 2:
        System.out.println("Enter your marks in Physics");
        byte s1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        byte s2 = sc.nextByte();
        System.out.println("Enter your marks in Computer");
        byte s3 = sc.nextByte();

        float avg = (s1+s2+s3)/3.0f;
        System.out.println("your overall percentage is "+ avg);

        if(avg>=40 && s1>=33 && s2>=33 && s3>=33){
            System.out.println("Congrats you are passed..");
        }
        else {
            System.out.println("Better luck next time..");
        }

        //QUESTION 4:
        System.out.println("Enter your number of day: ");
        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }   */
        //QUESTION 6:
        System.out.println("Enter your URL");
        String website = sc.nextLine();

        if (website.endsWith(".org")){
            System.out.println("It is an organisation website");
        }
        else if(website.endsWith(".com")){
            System.out.println("Its an commercial website");
        }
        else if (website.endsWith(".pk")){
            System.out.println("Its an Pakistani website");
        }
        else{
            System.out.println("its not a website");
        }

    }
}
