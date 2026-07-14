//
//  collage.java
//  
//
//  Created by Shubham Jana on 14/07/26.
//
import java.util.Scanner;
public class collage{
    public int roll_number;
    public String My_name;
public void set_value(int roll_number, String My_name){
    
    
    this.roll_number = roll_number;
    this.My_name = My_name;
//    int roll = 34;
//    String name = "Shubham Jana";
//    System.out.println("Hello "+name+" your roll number is "+roll);
    }
    public void display(int roll_number, String My_name){
        System.out.println("Roll: "+roll_number);
        System.out.println("Name: "+My_name);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your roll: ");
        int roll = scanner.nextInt();
        System.out.print("Enter your name: ");
        String name = scanner.next();
        collage Student = new collage();
        Student.set_value(roll,name);
        Student.display(roll,name);
    }
}
