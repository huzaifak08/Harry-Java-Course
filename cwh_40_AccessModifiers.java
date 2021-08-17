package com.company;

class Employeeee{
    private int id;
    private String name;
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class cwh_40_AccessModifiers {
    public static void main(String[] args) {
        Employeeee em = new Employeeee();
        //em.id = 23;
        //em.name = "Huzaifa Khan";

        em.setId(34);
        System.out.println(em.getId());
        em.setName("Huzaifa Khan");
        System.out.println(em.getName());
    }
}
