package com.company;

class Cylinder{

    //Problem # 01:
    private int Radius;
    private int Height;

    public int getRadius(){
        return Radius;
    }
    public void SetRadius(int radius){
        this.Radius = radius;
    }

    public int getHeight(){
        return Height;
    }
    public void setHeight(int height){
        this.Height = height;
    }

    //Problem # 03:
    public Cylinder(int radius, int height){
        this.Radius = radius;
        this.Height = height;
    }

    //Problem # 02:
    public double area(){
        return 2 * Math.PI * Radius * Radius + 2 * Math.PI * Radius * Height;
    }
    public double volume(){
        return Math.PI * Radius * Radius * Height;
    }
}

//Problem # 04:
class Rectangle{
    private int length;
    private int breath;
    //Constructor:
    public Rectangle(){
        this.length = 4;
        this.breath = 5;
    }
    //Constructor OverLoading:
    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }
    //if you want to print their values of use getters:
    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
    }


}

public class cwh_44_PS {
    public static void main(String[] args) {

        Cylinder c = new Cylinder(23,34);
/*
        //Problem # 01:
        c.setHeight(23);
        System.out.println(c.getHeight());

        c.SetRadius(34);
        System.out.println(c.getRadius());

        //Problem # 02:
        System.out.println(c.area());
        System.out.println(c.volume());


 */
        //Problem # 03:
        System.out.println(c.area());
        System.out.println(c.volume());

        //Problem # 04:
//        Rectangle r = new Rectangle();
//        System.out.println(r.getLength());
//        System.out.println(r.getBreath());

        //using overloaded constructor
        Rectangle r = new Rectangle(4,6);
        System.out.println(r.getLength());
        System.out.println(r.getBreath());
    }
}
