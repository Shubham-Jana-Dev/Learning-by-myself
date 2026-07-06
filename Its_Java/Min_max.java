//
//  javac Min_max.java && java Min_max.java
//
//
//  Created by Shubham Jana on 06/07/26.
//
public class Min_max{
public static int max(int[] MyArray){
    int maxElement = Integer.MIN_VALUE;
    for(int j : MyArray){
        if(j>maxElement){
            maxElement = j;
        }
    }
    return maxElement;
}
public static int min(int[] MyArray){
    int minElement = Integer.MAX_VALUE;
    for(int i : MyArray){
        if(i<minElement){
            minElement = i;
        }
    }
    return minElement;
}
    public static void main(String[] args){
        int[] TheArray = {12,334,6,76,8,6,833,86,90,-300,343,};
        int max_element = max(TheArray);
        int min_element = min(TheArray);
        System.out.println("The maximum element of this Array is "+max_element);
        System.out.println("The minimum element of this Array is "+min_element);
    }
}
