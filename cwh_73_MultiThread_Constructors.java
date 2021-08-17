package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("My Name is Khan");
    }
}


public class cwh_73_MultiThread_Constructors {
    public static void main(String[] args) {

        MyThr t1 = new MyThr("Hunny");
        t1.start();
        System.out.println("The id is "+ t1.getId());
        System.out.println("The name is "+ t1.getName());

        //YOU CAN USE A THREAD AS MANY TIMES YOU NEED
        MyThr t2 = new MyThr("Huzaifa");
        t2.start();
        System.out.println("The id is "+ t2.getId());
        System.out.println("The name is "+ t2.getName());

    }
}
