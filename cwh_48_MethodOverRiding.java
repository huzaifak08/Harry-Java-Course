package com.company;

class A{
    public int hunny(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of Class A");
    }
}
class B extends A{
    //Defining same methods in Parent and Child class (meth2)
    @Override
    public void meth2(){
        System.out.println("I am meth2 of Class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class cwh_48_MethodOverRiding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();

    }
}
