//
// javac Frequency.java && java Frequency.java
//
//
//  Created by Shubham Jana on 05/07/26.
//

import java.util.Scanner;
public class Frequency{
    public static int frequ( int[] TheArray,int TargetElement){
        int ElementFrequency = 0;
        for (int i : TheArray){
            if( i == TargetElement){
                ElementFrequency ++;
            }
        }
        return ElementFrequency;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] MyArray = {12,44,67,78,44,87,69,89,44,67,22,44,56,44,90};
        System.out.print("Enter the terget element: ");
        int Target = scanner.nextInt();
        int fr = frequ(MyArray,Target);
        System.out.println(Target+" has found "+fr+" times in the Array.");
    }
}
