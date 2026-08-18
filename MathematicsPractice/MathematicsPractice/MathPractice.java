package MathematicsPractice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
public class MathPractice{
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        HashMap<Integer, List<Integer>> myMap = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(!myMap.containsKey(nums[i])){
                myMap.put(nums[i],new ArrayList<>());
            }
                myMap.get(nums[i]).add(i);
        }
        System.out.println(myMap);

    }
}