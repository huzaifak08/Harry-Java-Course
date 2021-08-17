package com.company;

class Problem1a extends Thread{
    public void run(){
        System.out.println("Good Morning");
//        while (true){
//            System.out.println("Good Morning");
//        }
    }
}
class Problem1b extends Thread{
    public void run(){
        System.out.println("Welcome");
//        while (true){
//            System.out.println("Welcome");
////            try {
////                Thread.sleep(200);
////            }
////            catch (Exception e){
////                System.out.println(e);
////            }
//        }
    }
}

public class cwh_76_PS {
    public static void main(String[] args) {
        Problem1a p1 = new Problem1a();
        Problem1b p2 = new Problem1b();

        p1.setPriority(6);
        p2.setPriority(9);

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

        p1.start();
        p2.start();

        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
