//
//  Employee.java
//  
//
//  Created by Shubham Jana on 26/07/26.
//
package Access_Modifier;

public class Employee{
    private String empName;
    private String depName;
    private int idNumber;
    private String address;
    private String emailId;
    public Employee(String empName, String depName, int idNumber, String address, String emailId){
        this.empName = empName;
        this.depName = depName;
        this.idNumber = idNumber;
        this.address = address;
        this.emailId = emailId;
    }
    public void setName(String empName){
        this.empName = empName;
    }
    public void setDept(String depName){
        this.depName = depName;
    }
    public void setId(int idNumber){
        this.idNumber = idNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String emailId){
        this.emailId = emailId;
    }
    public String getName(){
        return empName;
    }
    public String getDept(){
        return depName;
    }
    public int getId(){
        return idNumber;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return emailId;
    }
    
}
