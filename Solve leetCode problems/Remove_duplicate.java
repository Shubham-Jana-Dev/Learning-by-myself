//
//  Remove_duplicate.java
//
//
//  Created by Shubham Jana on 08/07/26.
//

public class Remove_duplicate{
    public static int rm_dup(int[] theArray){
        int count = 1;
        int unique = 1;
        for(int current = 1; current < theArray.length; current++){
            if(theArray[current] != theArray[current - 1]){
                theArray[unique] = theArray[current];
                unique++;
                count++;
            }
        }
        
        System.out.print("\n[");
            for(int j: theArray){
                System.out.print(j+" ");
            }
            System.out.println("]");
        
        return count;
    }
    public static void main(String[] args){
        int[] Array1 = {0,0,1,1,2,2,3,3,3,4};
        int[] Array2 = {1, 1, 2, 2, 3, 4, 4};
        int[] Array3 = {10, 20, 30, 40};
        int[] Array4 = {7, 7, 7, 7, 7};
        int[] Array5 = {-5, -5, -3, 0, 0, 0, 12, 12};
        System.out.println(rm_dup(Array1));
        System.out.println(rm_dup(Array2));
        System.out.println(rm_dup(Array3));
        System.out.println(rm_dup(Array4));
        System.out.println(rm_dup(Array5));

    }
}
