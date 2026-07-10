//
//  idexes_of_subarray_sum.java
//  
//
//  Created by Shubham Jana on 10/07/26.
//
import java.util.Arrays;
public class indexes_of_subarray_sum{
    public static int[] subarray_sum_index(int[] theArray, int target){
        int right = 0;
        int left = 0;
        int sum = 0;
        int[] notfound = {-1};
        int[] result = {0,0};
        boolean flag = false;
        while(right<theArray.length){
            sum += theArray[right];
            while(sum>target){
                sum -= theArray[left];
                left++;
            }
            if(sum == target){
                flag = true;
                break;
            }
            right++;
        }
        if(flag){
        result[0] = left+1;
        result[1] = right+1;
        return result;
            }else{
                return notfound;
            }
    }
    public static void main(String[] args){
        int[] MyArray = {0,2,3,3,5,6,7,8};
        int target = 11;
        int[] theIndex = subarray_sum_index(MyArray,target);
        System.out.println("The indises are "+ Arrays.toString(theIndex));
    }
}
