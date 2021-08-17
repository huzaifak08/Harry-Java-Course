package com.company;

public class cwh_31_Methods {

/*      //STARTS FROM W3 SCHOOLS

   static void mymethod(String fname){
        System.out.println(fname + "Khan");
    }
    public static void main(String[] args) {
        mymethod("Huzaifa ");
        mymethod("Shoaib ");
        mymethod("Hunny ");
    }

    //More complicated:
    static void mymethod(String fname, int age){
        System.out.println(fname + " is "+ age);
    }
public static void main(String[] args) {
        mymethod("Huzaifa",12);
        mymethod("hunny",19);
        mymethod("Shoaib", 22);
    }

    //more complicated:
    static int mymethod(int x){
        return (5+x);
    }
public static void main(String[] args) {
    System.out.println(mymethod(5));
    System.out.println(mymethod(15));
    System.out.println(mymethod(25));
}

    //little more complicated:
    static int mymethod(int x, int y){
        return(x+y);
    }
    public static void main(String[] args) {
        System.out.println(mymethod(4,5));
        System.out.println(mymethod(5,15));
        System.out.println(mymethod(20,40));
    }

    //Storing the result in a seperate variable:
    static int mymethod(int x,int y){
        return (x+y);
    }
    public static void main(String[] args) {
        int z = mymethod(3,5);
        System.out.println(z);
    }

    //Getting the above little complicated:
    static int mymethod(int x, int y){
        return (x+y);
    }
    public static void main(String[] args) {
        int z = mymethod(3,4);
        int u = mymethod(10,4);
        int v = mymethod(20,4);

        System.out.println(z);
        System.out.println(u);
        System.out.println(v);
    }

    //Using if-else in method:
    static void checkAge(int age){
        if (age<18){
            System.out.println("You are just a baby to get heart broken...");
        }
        else {
            System.out.println("You are eligible to broke your heart...");
        }
    }
    public static void main(String[] args) {
        checkAge(14);
    }*/

    // CODE WITH HARRY(HUNNY)
    static int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z = x*y;
        }
        return (z);
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        System.out.println(c);
    }
}
