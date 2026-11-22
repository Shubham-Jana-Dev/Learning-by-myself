package OOP;
// Single inharitance 
public class Car{
    String brand;
    float milage;
    int speed;
    Car(String brand, float milage, int speed){
        this.brand = brand;
        this.milage = milage;
        this.speed = speed;
    }
}
class Toyota extends Car{
    String color;
        Toyota(String brand, float milage, int speed,String color){
            super(brand, milage, speed);
            this.color = color;
        }
    void displayInfo(){
        System.out.println("Car Details:- ");
        System.out.println("Brand:- "+this.brand);
        System.out.println("Milage:- "+this.milage+" In highway.");
        System.out.println("Speed:- "+this.speed+"M/H");
        System.out.println("Colour:- "+this.color);
    }
    public static void main(String args[]){
        Toyota t1 = new Toyota("XUV",15,135,"Black");
        t1.displayInfo();
    }
}

