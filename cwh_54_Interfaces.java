package com.company;

interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Cow1 implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Cow says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}


public class cwh_54_Interfaces {
    public static void main(String[] args) {
        Cow1 mycow = new Cow1();  // Create a Pig object
        mycow.animalSound();
        mycow.sleep();
    }
}
