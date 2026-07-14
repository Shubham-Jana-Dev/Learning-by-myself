//
//  class_practice.java
//  
//
//  Created by Shubham Jana on 14/07/26.
//
public class PracticeRectangle{
    private double length;
    private double width;
    public PracticeRectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double CalculateArea(){
        return this.width * this.length;
    }
    public static void main(String[] args){
        
        double s1 = 23.56;
        double s2 = 32.33;
        PracticeRectangle cal = new PracticeRectangle(s1,s2);
        double theArea = cal.CalculateArea();
        System.out.println("The area: "+theArea);
    }
}
