package com.company;

class ekclass{
    int a;
    ekclass(int a){     //this is a constructor but also works as setter...
        this.a=a;
    }
    public int getA(){
        return a;
    }
    public int return1(){
        return 1;
    }
}
class doclass extends ekclass{
    doclass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}

public class cwh_47_This_Super_Keyword {
    public static void main(String[] args) {
        ekclass e = new ekclass(5);
        //doclass d = new doclass(6);
        System.out.println(e.getA());
    }
}
