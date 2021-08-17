package com.company;

class Mythread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<200){
            System.out.println("My Cooking thread is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<200){
            System.out.println("Thread 2 for chatting with her");
            System.out.println("i am sad");
            i++;
        }
    }
}

public class cwh_70_MultiThreading_Using_Classes {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
