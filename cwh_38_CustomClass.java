package com.company;

class employee1{
    int id;
    String name;
    int Salary;
    //Creating method in Class:
    public void print_details() {
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
    }
    public int getSalary(int Salary){
        return Salary;
    }
}

public class cwh_38_CustomClass {
    public static void main(String[] args) {

        //Instantiating a new Employee object:
        employee1 hunny = new employee1();
        employee1 shoaib = new employee1();

        //Setting Attributes For Hunny:
        hunny.id = 12;
        hunny.name = "Huzaifa Khan";
        hunny.Salary = 34;

        //Setting Attributes For Shoaib:
        shoaib.id = 17;
        shoaib.name = "Shoaib Khan";
        shoaib.Salary = 36;

        //Printing the attributes:
        //System.out.println(hunny.id);
        //System.out.println(hunny.name);
        //System.out.println(shoaib.id);
        //System.out.println(shoaib.name);

        //Now printing attributes for Hunny , WTH of method above in Class:
        hunny.print_details();
        System.out.println(hunny.getSalary(23));
        //hunny.getSalary();
        //System.out.println(hunny.getSalary());

        //Now printing attributes for Shoaib , WTH of method above in Class:
        shoaib.print_details();
        //int Salary = shoaib.getSalary();
        //System.out.println(shoaib.getSalary());

    }
}
