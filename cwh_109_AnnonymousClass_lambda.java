package com.company;

@FunctionalInterface
interface demoAno{
    void meth1(int a);
//    void meth2();
}

/*
class hunny implements demoAno{
    public void meth1(){
        System.out.println("I am method 1");
    }
}
 */

/*
class anoDemo implements demoAno{
    @Override
    public void meth1(){
        System.out.println("Method1");
    }
    @Override
    public void meth2(){
        System.out.println("Method2");
    }
}

 */

public class cwh_109_AnnonymousClass_lambda {
    public static void main(String[] args) {
        /*
        anoDemo obj = new anoDemo();
        obj.meth1();

         */

        /*
        demoAno obj = new demoAno() {
            @Override
            public void meth1() {
                System.out.println("method1");
            }

            @Override
            public void meth2() {
                System.out.println("Method2");
            }
        };

        obj.meth1();
         */

        /*
        demoAno obj = new hunny();
        obj.meth1();
         */

        demoAno obj = (a)->{
            System.out.println("method 1" + a);
        };
        obj.meth1(6);


    }
}
