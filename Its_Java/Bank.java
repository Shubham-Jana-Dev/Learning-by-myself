//
//  Persion.java
//  
//
//  Created by Shubham Jana on 24/07/26.
//
public class Persion{
    private String name;
    private String address;
    private double balance;
    public Persion(){
        this("Shubham","Kolkata",0.00);
    }
    public Persion(String name, String address){
        this(name,address,3444);
    }
    public Persion(String name, String address, double balance){
        this.name = name;
        this.address = address;
        this.balance = balance;
    }
    public void show(){
        System.out.println("Name: "+name + " Address: " + address + " Balance: "+ balance);
    }
}
public class Bank{
    public static void main(String[] args){
    Persion b1 = new Persion();
    Persion b2 = new Persion("Shubham","Kolkata");
    Persion b3 = new Persion("Shubham","Kolkata",7000);
    b1.show();
    b2.show();
    b3.show();
    }
}
