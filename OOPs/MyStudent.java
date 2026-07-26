//
//  MyStudent.java
//  
//
//  Created by Shubham Jana on 25/07/26.
//
package OOPs;
import Its_Java.MyInformation;

public class MyStudent{
   public String name;
    public String address;
    public int rollNumber;
    public MyStudent(String name, String address, int rollNumber){
        this.name = name;
        this.address = address;
        this.rollNumber = rollNumber;
    }
    public static void main(String[] args){
        MyStudent s1 = new MyStudent("Shubham","Kolkata",34);
       StudentInfo Sinfo1 = new StudentInfo();
        Sinfo1.displayInfo(s1.name,s1.address,s1.rollNumber);
        
        MyInformation MInfo1 = new MyInformation();
        MInfo1.displayInformation(s1.name,s1.address,s1.rollNumber);
    }
}
