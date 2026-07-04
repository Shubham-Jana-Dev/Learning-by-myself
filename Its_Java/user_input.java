//
//  user_input.java
//  
//
//  Created by Shubham Jana on 04/07/26.
//
import java.util.Scanner;
public class user_input{
    public static void get_info(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble();
        
        System.out.println("Hellow " + name);
        System.out.println(" Nice to meet you.");
        scanner.close();
        
        System.out.println("And " + name + " Your CGPA is "+ cgpa);
    }
    public static void main(String[] args){
        get_info();
        }
}
