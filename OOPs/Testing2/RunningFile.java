//
//  RunningFile.java
//  
//
//  Created by Shubham Jana on 26/07/26.
//
package Testing2;
public class RunningFile{
    public static void change(Student s1){
         s1.setName("Shubham");
    }
    public static void main(String[] args){
        RunningFile r1 = new RunningFile();
        Student s11 = new Student("Raghav Sir","Collage Walla",342);
        r1.change(s11);
        System.out.println(s11.getName());
        System.out.println(s11.getDepartment());
    }
}
