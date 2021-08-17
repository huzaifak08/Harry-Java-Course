package com.company;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}
class rectangle{
    int length;
    int breath;
    public int area(){
        return length*breath;
    }
    public int parameter(){
        return 2*(length+breath);
    }
}
class circle{
    float radius;
    public float area(){
        return (3.14f*radius);
    }
    public float parameter(){
        return (2*3.14f*radius);
    }
}
class tommy{
    public void run(){
        System.out.println("Running...");
    }
    public void hit(){
        System.out.println("Hitting");
    }
    public void fire(){
        System.out.println("firing");
    }
}

public class cwh_39_PS {
    public static void main(String[] args) {

        //PROBLEM 1:
     /*   Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        //PROBLEM 2:
        cellphone mycell = new cellphone();
        mycell.ring();
        mycell.vibrate();

        //PROBLEM 3:
        square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.parameter());

        //PROBLEM 4:
        rectangle re = new rectangle();
        re.length = 2;
        re.breath = 4;
        System.out.println(re.area());
        System.out.println(re.parameter());

        //PROBLEM 6:
        circle ci = new circle();
        ci.radius = 4;
        System.out.println(ci.area());
        System.out.println(ci.parameter());     */

        //PROBLEM 5:
        tommy vc = new tommy();
        vc.fire();
        vc.hit();
        vc.run();
    }
}
