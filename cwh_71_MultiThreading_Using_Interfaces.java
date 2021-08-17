package com.company;

class MyThreadRunnable implements Runnable{

    public void run(){
        for(int i=0 ; i<300 ; i++){
            System.out.println("I am a Thread 1");
        }
    }
}

class MyThreadRunnable2 implements Runnable{

    public void run(){
        for (int i=0; i<300; i++){
            System.out.println("I am a Thread 2");
        }
    }
}

public class cwh_71_MultiThreading_Using_Interfaces {
    public static void main(String[] args) {

        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        gun1.start();

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }
}
