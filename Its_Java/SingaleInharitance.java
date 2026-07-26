//
//  Main.java
//  
//
//  Created by Shubham Jana on 24/07/26.
//

class Person{
    protected String name;
    protected int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

    }
}

class Employee extends Person{
    private double salary;
    
    public Employee(String name, int age, double salary){
        super(name,age);
        this.salary = salary;
    }
    public void displayEmployee(){
        displayPerson();
        System.out.println("Salary: ₹"+salary);
    }
}

public class SingaleInharitance{
    public static void main(String[] args){
        Employee emp = new Employee("Shubham Jana",20,45000.0);
        emp.displayEmployee();
}
}
