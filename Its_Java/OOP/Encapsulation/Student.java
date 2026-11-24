package OOP.Encapsulation;

public class Student {
    private String name;
    private int rollNumber;
    private int age;

   public void setName(String name){
    this.name = name;
   }

   public String getName(){
    return this.name;
   }
   public void setRoll(int y){
    if(y<=0){
        rollNumber = 0;
    }
    else{
        rollNumber = y;
    }
   }
   public int getRoll(){
    return rollNumber;
   }
   public void setAge(int z){
    if(z<=0){
        age = 0;
    }else{
        age = z;
    }
   }
   public int getAge(){
    return age;
   }
}
