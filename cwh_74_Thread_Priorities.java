package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("Thank you "+ this.getName());
        }
    }
}

public class cwh_74_Thread_Priorities {
    public static void main(String[] args) {

        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Harry2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Harry4");
        MyThr1 t5 = new MyThr1("Harry5 (important One)");

        t1.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t5.setPriority(Thread.MAX_PRIORITY);
    }
}
