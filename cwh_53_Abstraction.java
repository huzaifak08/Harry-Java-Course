package com.company;

/*
1)  Abstract class: is a restricted class that cannot be used to create objects
(to access it, it must be inherited from another class).

2)  Abstract method: can only be used in an abstract class, and it does not have
a body. The body is provided by the subclass (inherited from).

 */


/*
// from W3 Schools
abstract class Animal{
    public abstract void AnimalSound();
    public void sleep(){
        System.out.println("ZZzzzz");
    }
}
class Cow extends Animal{
    @Override
    public void AnimalSound(){
        System.out.println("Mooo Mooo");
    }
}

public class cwh_53_Abstraction {
    public static void main(String[] args) {

        Cow c = new Cow();
        c.sleep();
        c.AnimalSound();
    }
} */

//From Code with harry
abstract class parent2{
    public parent2(){
        System.out.println("I am a constructor...");
    }
    public void sayHallo(){
        System.out.println("Hello");
    }
    public abstract void greet();
}
class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
abstract class child3 extends parent2{
    public void th(){
        System.out.println("i am good");
    }
}
public class cwh_53_Abstraction {
    public static void main(String[] args) {
        child2 c2 = new child2();
        //Parent2 p = new Parent2(); -- error
        //Child3 c3 = new Child3(); -- error
        c2.sayHallo();
        c2.greet();
    }
}
