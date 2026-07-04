//
// javac Conditional_statements.java && java Conditional_statements.java
//
//
//  Created by Shubham Jana on 04/07/26.
//
import java.util.Scanner;
public class Conditional_statements{
public static int larger_number(){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
int num1 = scanner.nextInt();

System.out.print("Enter teh second number: ");
int num2 = scanner.nextInt();

int max = (num1 > num2) ? num1 : num2;
    return max;
}
public static void main(String[] args){
int result = larger_number();
    System.out.println("The larger number is " + result);
}
}
