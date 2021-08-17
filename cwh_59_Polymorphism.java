package com.company;

interface MyCamera1{
    public void snap();
    public void recordvideo();
    //just an additional concept of private(not necessary to understand here)
    private void greet(){
        System.out.println("Good Morning");
    }
    // with the help of default method you can write body of method in interface
    default void record4k(){
        greet();
        System.out.println("Recording in 4k");
    }
}
interface Wifi1{
    public String[] getNetwork();
    public void connectToNetwork(String network);
}
class MyCellPhone1{
    public void callNumber(int phnum){
        System.out.println("Calling..."+ phnum);
    }
    public void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone1 extends MyCellPhone1 implements MyCamera1,Wifi1{
    public void snap(){
        System.out.println("Taking Snap");
    }
    public void recordvideo(){
        System.out.println("Recording video");
    }
    public String[] getNetwork(){
        System.out.println("Getting all networks");
        String[] Networklist = {"Harry","Hunny","Shoaib"};
        return Networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class cwh_59_Polymorphism {
    public static void main(String[] args) {
        //Dynamic method dispatch:
        MyCamera1 cam1 = new MySmartPhone1();
        //here you can use only MyCamera1 features:
        cam1.record4k();
    }
}
