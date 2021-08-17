package com.company;

class Circle{
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class cwh_52_PS {
    public static void main(String[] args) {

        //PROBLEM 1:
        Cylinder1 obj = new Cylinder1();
    }
}
