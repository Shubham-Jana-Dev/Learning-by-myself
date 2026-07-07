//
// javac Douplicat_find.java && java Douplicat_find.java
//
//
//  Created by Shubham Jana on 07/07/26.
//
import java.util.HashSet;
public class Douplicat_find{
    public static boolean dup(int[] theArray){
        boolean duplicate = false;
        HashSet<Integer> MySet = new HashSet<>();
        for (int j: theArray){
            if(MySet.contains(j)){
                duplicate = true;
                break;
            }
            MySet.add(j);
        }
        return duplicate;
    }
    public static void main(String[] args){
        int[] MyArray = {12,34,44,76,89,88,90};
        if(dup(MyArray)){
            System.out.println("The array has duplicate elements.");
        }
        else{
            System.out.println("The array does not have any duplicate element.");
        }
    }
}
