//
//  PracticeClasses.java
//  
//
//  Created by Shubham Jana on 21/07/26.
//
import java.util.Scanner;

public class PracticeClasses{
    // Creating an user defined data type (with multiple atributes)
    public static class Student{
        String name;
        int rollNumber;
        double percent;
        public void displayStudentInfo(){
            System.out.println("--Student Name--\nName: " + name +"\nRoll Number: "+rollNumber+"\nPercent: "+percent);
        }
        
        
    }
    public static class Car{
        String carName;
        String carType;
        int carPrice;
        public void displayCarInfo(){
            System.out.println("--:Car Information:--\nCar name: "+carName+"\nCar Type: "+carType+"\nCar Price: "+carPrice);
            
        }
        
    }
    
    
    
    
    public static void  main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        
        
        Car c1 = new Car();
        System.out.print("Enter the car name: ");
        c1.carName = sc.nextLine();
        System.out.print("Enter the type of the car: ");
        c1.carType = sc.nextLine();
        System.out.print("Enter the price of the car: ");
        c1.carPrice = sc.nextInt();
        sc.nextLine();
        c1.displayCarInfo();
        
        
        Student x = new Student();
        System.out.print("Enter your name: ");
        x.name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        x.rollNumber = sc.nextInt();
        System.out.print("Enter your percent: ");
        x.percent = sc.nextDouble();
        x.displayStudentInfo();
        
        
        Student y = new Student();
        y.name = "Raghav";
        y.rollNumber = 23;
        y.percent = 78.98;
        y.displayStudentInfo();
       
    }
}
