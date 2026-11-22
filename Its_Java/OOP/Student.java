package OOP;
import java.util.Scanner;
public class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int roll;
    String stream;
    String Standard;
    Student(String name,int roll,String stream,String Standard){
        this.name = name;
        this.roll = roll;
        this.stream = stream;
        this.Standard = Standard;
    }
    void displayInfo(){
        System.out.println("--Student Details--");
        System.out.println("\tName: "+this.name);
        System.out.println("\tRoll: "+this.roll);
        System.out.println("\tStream: "+this.stream);
        System.out.println("\tStandard: "+this.Standard);
    }
    void updateRoll(){
        System.out.println("Enter the new roll number: ");
        int Nroll = sc.nextInt();
        this.roll = Nroll;
    }
    public static void main(String args[]){
       Student s1 = new Student("Cloe",9,"Science","VIII");
       Student s2 = new Student("Clor", 5, "Science", "VII");
       s1.updateRoll();
       s1.displayInfo();
       s2.displayInfo();
    }
}