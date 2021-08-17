package com.company;

interface Bicycle{
    public void Speedup();
    public void Brakes();
}
interface Horn{
    public void Horn1();
    public void Horn2();
}
/*
Making single class for multiple interfaces:
That is
 the main difference between Abstract Class and interfaces because it is not possible in
Abstract Class.
 */
class AvonCycle implements Bicycle,Horn{
    public void Speedup(){
        System.out.println("Applying Speed up");
    }
    public void Brakes(){
        System.out.println("Applying Brakes");
    }
    public void Horn1(){
        System.out.println("Tum mily to");
    }
    public void Horn2(){
        System.out.println("zindagi tu hi bata");
    }
}

public class cwh_55_Interfaces_In_Detail {
    public static void main(String[] args) {
        AvonCycle hunnycycle = new AvonCycle();
        hunnycycle.Brakes();
        hunnycycle.Horn1();
        hunnycycle.Horn2();
        hunnycycle.Speedup();
    }
}
