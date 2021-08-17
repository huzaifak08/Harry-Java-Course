package com.company;

class MyEmployeeee{

    private int id;
    private String name;
    private int salary;

    //CONSTRUCTORS:
    public MyEmployeeee(){
        this.id = 0;
        this.name = "Huzaifa Khan";
    }
    //CONSTRUCTOR OVERLOADING:
    public MyEmployeeee(int id, String name){
        this.id= id;
        this.name = name;
    }
    public MyEmployeeee(String name){
        this.id = 1;
        this.name = name;
    }
    public MyEmployeeee(int id, String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //METHODS:
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        this.salary = s;
    }
}
public class cwh_42_Constructor {
    public static void main(String[] args) {

        MyEmployeeee em = new MyEmployeeee(12,"Hunny", 34);

        //em.id = 23;
        //em.name = "Huzaifa Khan";

        System.out.println(em.getId());
        System.out.println(em.getName());
        System.out.println(em.getSalary());

    }
}
