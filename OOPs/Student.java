//
//  Student.java
//  
//
//  Created by Shubham Jana on 23/07/26.
//
package OOPs;
public class Student{
    private String name;
    private int rollNo;
    private double percentage;
    public Student(String name,int rollNo, double percentage){
        setName(name);
        setRollNo(rollNo);
        setPercentage(percentage);
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setRollNo(int rollNo){
        if(rollNo <= 0){
            System.out.println("Invalid Roll number :(");
        }else{
        this.rollNo = rollNo;
        }
    }
    public int getRollNo(){
        return rollNo;
    }
    
    public void setPercentage(double percentage){
        if(percentage < 0.0 || percentage > 100){
            System.out.println("Invalid Percentage! :(");
        }else{
        this.percentage = percentage;
        }
    }
    
    public double getPercentage(){
        return percentage;
    }
    
    public static void change(Student n){
        n.setName("unknown");
        n.setRollNo(34);
    }
    
//    public static void main(String[] args){
//        Student S1 = new Student("Shubham",34,87);
//        S1.setName("Shubham");
//        S1.setRollNo(21);
//        
//        System.out.println(S1.getName());
//        System.out.println(S1.getRollNo());
//        change(S1);
//        System.out.println(S1.getName());
//        System.out.println(S1.getRollNo());
//    }
}
