package com.company;

interface MyCamera{
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
interface Wifi{
    public String[] getNetwork();
    public void connectToNetwork(String network);
}
class MyCellPhone{
    public void callNumber(int phnum){
        System.out.println("Calling..."+ phnum);
    }
    public void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,Wifi{
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

public class cwh_57_Default_Methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
//        ms.snap();
//        ms.recordvideo();
//        ms.getNetwork();
//        ms.connectToNetwork("Hunny");
//        ms.record4k();

        //Print getNetwork String
        //Use for each loop in both method
        /*
        First Method:
        String[] ar = ms.getNetwork();
        for(String item:ar){
        System.out.println(item);
        }
         */

        //Second Method:
        for(String item:ms.getNetwork()){
            System.out.println(item);
        }

    }
}
