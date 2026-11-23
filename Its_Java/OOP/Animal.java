package OOP;

public abstract class Animal{
    public abstract void sayHello();

    void sleep(){
        System.out.println("Zzzzz....");
    }
    public static void main(String args[]){
        CloeBug Cloe = new CloeBug();
        Cloe.sleep();
        Cloe.sayHello();
    }
}
class CloeBug extends Animal{
        public void sayHello(){
            System.out.println("Relax guys...");
        }
}