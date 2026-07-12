//
// java Second_largest.java
//
//
//  Created by Shubham Jana on 11/07/26.
//
public class Second_largest{
    public static int second_max(int[] theArray){
        int passed_element = 0;
        int max_element = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int result = 0;
        for(int current_element = 0; current_element<theArray.length; current_element++){
            if(theArray[current_element] > max_element){
                second_large = max_element;
                max_element = theArray[current_element];
            }
            else if(second_large < theArray[current_element] && theArray[current_element] < max_element){
                    second_large = theArray[current_element];
            }
            result = second_large;
        }
        return result;
    }
    public static void main(String[] args){
        int[] myArray = {12, 35, 1, 10, 34, 1};
        int n = second_max(myArray);
        System.out.println("The Second largest element of the array is "+n);
        
        int[] myArray1 = {-10, -5, -20, -1, -3};
        int n1 = second_max(myArray1);
        System.out.println("The Second largest element of the array is "+n1);
        
        int[] myArray2 = {10, 20, 20, 8, 15};
        int n2 = second_max(myArray2);
        System.out.println("The Second largest element of the array is "+n2);
        
        int[] myArray3 = {5, 10, 15, 20, 25};
        int n3 = second_max(myArray3);
        System.out.println("The Second largest element of the array is "+n3);
        
        int[] myArray4 = {42, 7};
        int n4 = second_max(myArray4);
        System.out.println("The Second largest element of the array is "+n4);
        
        int[] myArray5 = {10, 20, 8, 20};
        int n5 = second_max(myArray5);
        System.out.println("The Second largest element of the array is "+n5);
        
        int[] myArray6 = {5, 20, 10, 20};
        int n6 = second_max(myArray6);
        System.out.println("The Second largest element of the array is "+n6);
        
        int[] myArray7 = {20, 15, 20, 18};
        int n7 = second_max(myArray7);
        System.out.println("The Second largest element of the array is "+n7);
    }
}
