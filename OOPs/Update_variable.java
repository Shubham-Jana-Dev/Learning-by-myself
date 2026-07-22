//
//  Update_variable.java
//  
//
//  Created by Shubham Jana on 21/07/26.
//

public class Update_variable{
   public static class Student{
       String name;
       int roll;
       double percent;
   }
//        public static void changeInt(Student roll){
//            roll = 999;
//            return;
//        }
//        public static void chageString(Student name){
//            name = "Unknown";
//            return;
//        }
    
    public static void main(String[] args){
        Student S1 = new Student();
        S1.roll = 12;
        S1.name = "Rahul";

        System.out.println(S1.roll);
        System.out.println(S1.name);
        
        S1.roll = 34;
        S1.name = "Shubham";
        
        System.out.println(S1.roll);
        System.out.println(S1.name);
    }
}
