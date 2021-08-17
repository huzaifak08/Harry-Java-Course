package com.company;

public class cwh_32_MethodOverloading {

    //You can have same name but different parameters

    static void foo(){
        System.out.println("Good morning Hunny");
    }
    static void foo(int a){
        System.out.println("Good morning"+ a+ "Bro");
    }
    static void foo(int a,int b){
        System.out.println("Good morning"+ a + "bro"+ b);
    }

    public static void main(String[] args) {
        foo();
        foo(200);
        foo(3000,8000);
    }
}
