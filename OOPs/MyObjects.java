//
//  MyObjects.java
//  
//
//  Created by Shubham Jana on 20/07/26.
//
public class MyObjects{
    private String name;
    private int RollNumber;
    private double marks;
    public MyObjects(String name, int RollNumber,double marks){
        this.name = name;
        this.RollNumber = RollNumber;
        this.marks = marks;
    }
    public void display(){
        System.out.println("Hi "+name+" your roll number is: "+RollNumber+".\nAnd you got "+marks+" in previous exam.");
    }
    public static void main(String[] args){
        String MyName = "Shubham";
        int MyRoll = 34;
        double MyMarks = 568.76;
        MyObjects student1 = new MyObjects(MyName,MyRoll,MyMarks);
        student1.display();
    }
}
