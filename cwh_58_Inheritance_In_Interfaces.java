package com.company;

interface SampleInterface{
    public void meth1();
    public void meth2();
}
//here ChildSampeInterface inherits the SampleInterface above:
interface ChildSampleInterface extends SampleInterface{
    public void meth3();
    public void meth4();
}
class MySampleClass implements ChildSampleInterface{
    public void meth1(){
        System.out.println("Method1");
    }
    public void meth2(){
        System.out.println("Method2");
    }
    public void meth3(){
        System.out.println("Method3");
    }
    public void meth4(){
        System.out.println("Method4");
    }
}

public class cwh_58_Inheritance_In_Interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
