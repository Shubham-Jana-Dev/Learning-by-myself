package OOP;

public class Vehicle {
    String type;
    Vehicle(String type){
        this.type = type;
    }
    public static void main(String args[]){
        Honda h1 = new Honda("Car","Honda",12,123,"Mid night blue","Desel");
        h1.displayInfo();
        BYD b1 = new BYD("Car","BYD+",23,114,"Lithiam","EV");
        b1.displayInfo();
    }
}
class Car extends Vehicle{
    String Brand;
    int milage;
    int speed;
    String fuelType;
    Car(String type, String Brand, int milage, int speed,String fuelType){
        super(type);
        this.Brand = Brand;
        this.milage = milage;
        this.speed = speed;
        this.fuelType = fuelType;
    }
}
class Honda extends Car{
    String color;
    Honda(String type, String Brand, int milage, int speed, String color, String fuelType){
        super(type, Brand, milage, speed, fuelType);
        this.color = color;
    }
    void displayInfo(){
        System.out.println("===== Car Details =====");
        System.out.println("Type: "+this.type);
        System.out.println("Brand: "+this.Brand);
        System.out.println("Milage: "+this.milage);
        System.out.println("Speed: "+this.speed);
        System.out.println("Fuel Type: "+this.fuelType);

    }
}
class BYD extends Car{
    String battery;
    BYD(String type,String Brand, int milage, int speed, String battery, String fuelType){
        super(type, Brand, milage, speed, fuelType);
        this.battery = battery;
    }
    void displayInfo(){
        System.out.println("===== Car Details =====");
        System.out.println("Type: "+this.type);
        System.out.println("Brand: "+this.Brand);
        System.out.println("Milage: "+this.milage);
        System.out.println("Speed: "+this.speed);
        System.out.println("Fuel Type: "+this.fuelType);

    }

}