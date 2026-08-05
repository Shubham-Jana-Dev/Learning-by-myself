//
//  RnnubgFile.java
//  
//
//  Created by Shubham Jana on 28/07/26.
//

class Vehicle {
    protected String fuelType;

    public Vehicle(String fuelType) {
        this.fuelType = fuelType;
    }

    public void run() {
        System.out.println("Vehicle is running on " + fuelType + ".");
    }
}


class Car extends Vehicle {
    protected String brand;

    public Car(String fuelType, String brand) {
        super(fuelType);
        this.brand = brand;
    }

    public void steer() {
        System.out.println("Car is navigating wheels.");
    }
}


class AutonomousCar extends Car {
    private String softwareVersion;

    public AutonomousCar(String fuelType, String brand, String swVersion) {
        super(fuelType, brand);
        this.softwareVersion = swVersion;
    }

    public void selfDrive() {
        System.out.println("Autonomous car operating on AI software version: " + softwareVersion);
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {
       
        AutonomousCar myCar = new AutonomousCar("Electric", "Tesla Model S", "v12.4");
        
        
        myCar.run();
        myCar.steer();
        myCar.selfDrive();
    }
}

