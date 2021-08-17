package com.company;

//QUESTION 1+2:
abstract class pen{
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends pen{
    public void write(){
        System.out.println("Write");
    }
    public void refill(){
        System.out.println("Refill");
    }
    public void Nib(){
        System.out.println("Change the nib");
    }
}

//QUESTION 3+5:
class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("biting");
    }
}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

//QUESTION 4:
abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class Smartphone2 extends Telephone{
    @Override
    public void ring() {
        System.out.println("Ringing");
    }

    @Override
    public void lift() {
        System.out.println("lifting");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnecting");
    }
}

//QUESTION 6+7:
interface TVRemote{
    public void forward();
    public void backward();
}
interface STVRemote extends TVRemote{
    public void VolumeInc();
    public void VolumeDec();
}
class TV implements STVRemote{
    @Override
    public void forward(){
        System.out.println("Channel Forward");
    }
    @Override
    public void backward(){
        System.out.println("Channel Backward");
    }
    public void VolumeInc(){
        System.out.println("Increasing Volume");
    }
    public void VolumeDec(){
        System.out.println("Decreasing Volume");
    }
}

public class cwh_60_PS {
    public static void main(String[] args) {

        //QUESTION 1+2:
        FountainPen pen = new FountainPen();
        pen.Nib();
        pen.refill();
        pen.write();

        //QUESTION 3+5:
        Monkey m = new Human();
        m.bite();
        m.jump();
        //you can use only there function.

        //QUESTION 4:
        Telephone tele = new Smartphone2();
        tele.disconnect();
        tele.lift();
        tele.ring();

        //QUESTION 6+7:
        TV t = new TV();
        t.backward();
        t.forward();
        t.VolumeDec();
        t.VolumeInc();
    }
}
