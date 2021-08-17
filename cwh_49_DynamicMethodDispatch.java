package com.company;

class Phone{
    public void time(){
        System.out.println("Time is 8PM");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("playing music");
    }
    @Override
    public void on(){
        System.out.println("Turning on Smartphone");
    }
}

public class cwh_49_DynamicMethodDispatch {
    public static void main(String[] args) {

        //Phone ph = new Phone();
        //ph.greet();

        Phone d = new Smartphone(); //It is also allowed in java.
        d.on();
        d.time();
        //d.music();    not allowed
    }
}
