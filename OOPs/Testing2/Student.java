//
//  Student.java
//  
//
//  Created by Shubham Jana on 26/07/26.
//
package Testing2;

public class Student{
    private String name;
    private String department;
    private int rollNumber;
    public Student(String name, String department, int rollNumber){
    this.name = name;
    this.department = department;
    this.rollNumber = rollNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public int getRollNumber(){
        return rollNumber;
    }
}
