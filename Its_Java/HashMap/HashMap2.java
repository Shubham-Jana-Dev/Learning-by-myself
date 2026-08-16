import java.util.HashMap;
public class HashMap2{
	public static void main(String[] args){
		int[] nums = {2,2,1,1,1,2,2};
		HashMap<Integer, Integer> myMap = new HashMap<>();
        int maxOc = 0;
        int result = 0;
        for(int j : nums){
            if(myMap.containsKey(j)){
                myMap.put(j, myMap.get(j)+1);
            }else{
                myMap.put(j,1);
            }
        }
       for (Integer k : myMap.keySet()) {
        result = k;
        System.out.println(k);
        if(maxOc > myMap.get(k)){
            maxOc = myMap.get(k);
            result = k;
        }
       }
       System.out.println(myMap);
       System.out.println(result);
	}
}