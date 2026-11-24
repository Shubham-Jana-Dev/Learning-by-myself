package OOP.Encapsulation;

public class test {
    public static void main(String[] args){
        Student stu = new Student();
    
        stu.setName("Shubham");
        System.out.println("Name: "+stu.getName());
        stu.setRoll(34);
        System.out.println("Roll Number: "+ stu.getRoll());
        
        stu.setAge(13);
        System.out.println("Student Age: "+stu.getAge());
    }
}
