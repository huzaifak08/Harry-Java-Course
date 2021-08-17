package com.company;
@FunctionalInterface
//an interface with one method is called functional interface:
interface fi{
    void methh();
}
class phone{
    public void time(){
        System.out.println("Time is 8:33 PM");
    }
}
class newPhone extends phone implements fi{
    @Override
    public void time(){
        System.out.println("Time is 8:33 AM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
    public void methh(){
        System.out.println("i am Functional interface method");
    }
}
public class cwh_108_Annotation {
    public static void main(String[] args) {
        newPhone phone = new newPhone();
        phone.time();
        phone.sum(5,6);
    }
}
