//
//  MainRunFile.java
//  
//
//  Created by Shubham Jana on 26/07/26.
//
package Access_Modifier;

public class MainRunFile{
    public static void main(String[] args){
        Employee emp1 = new Employee("Shubham Jana","IT",400934,"Kolkata","shubhamjana87@gmail.com");
        Show s1 = new Show();
        s1.displayDetails(emp1.getName(),emp1.getDept(),emp1.getId(),emp1.getAddress(),emp1.getEmail());
    }
}
