//
//  javac Simple_calculater.java && java Simple_calculater.java
//
//
//  Created by Shubham Jana on 04/07/26.
//
import java.util.Scanner;
public class Simple_calculater{
    public static double addition(double num1, double num2){
        return num1 + num2;
    }
    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        if(num2 == 0){
            System.out.println(" Error Divition can not possible! ");
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
    public static double modulo(double num1, double num2){
        return num1 % num2;
    }
    public static double MyCalculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter a operator: (+,-,*,/,% any of these):");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0.0;
        if ( operator == '+'){
            result = addition(num1,num2);
        }else if(operator == '-'){
            result = subtraction(num1,num2);
        }else if(operator == '*'){
            result = multiplication(num1,num2);
        }else if(operator == '%'){
            result = modulo(num1,num2);
        }else{
            System.out.println("Please Enter a valid input :(");
        }
        try {
            if(operator == '/'){
                result = division(num1,num2);
            }
            }catch (ArithmeticException er){
                System.out.println("Error: "+ er.getMessage());
                return 0;
        }
        System.out.print(num1 +" "+ operator + " " + num2 + " " + "=" +" "+result );
        return result;
    }
    public static void main(String[] args){
        MyCalculate();
    }
}
