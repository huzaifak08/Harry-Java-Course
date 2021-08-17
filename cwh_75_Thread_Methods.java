package com.company;

class MynewThr1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Huzaifa Khan");
        }
    }
}

class MynewThr2 extends Thread{
    public void run(){
        int i=0;
        while (true){
            System.out.println("Shoaib Khan---------------");
            try {
                Thread.sleep(50);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

public class cwh_75_Thread_Methods {
    public static void main(String[] args) {

        MynewThr1 t1 = new MynewThr1();
        MynewThr2 t2 = new MynewThr2();

        t1.start();
//        try {
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
