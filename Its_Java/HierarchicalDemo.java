//
//  HierarchicalDemo.java
//  
//
//  Created by Shubham Jana on 28/07/26.
//
class Member {
    protected String institution = "IIT Delhi";
    public void showInstitution() { System.out.println("Institution: " + institution); }
}

class Faculty extends Member {
    private String department;
    public Faculty(String dept) { this.department = dept; }
    public void printFaculty() { System.out.println("Role: Professor | Department: " + department); }
}

class Student extends Member {
    private String course;
    public Student(String course) { this.course = course; }
    public void printStudent() { System.out.println("Role: Scholar | Program: " + course); }
}

public class HierarchicalDemo {
    public static void main(String[] args) {
        Faculty prof = new Faculty("Computer Science");
        Student stud = new Student("M.Tech Data Science");
        
        prof.showInstitution();
        prof.printFaculty();
        stud.showInstitution();
        stud.printStudent();
    }
}

