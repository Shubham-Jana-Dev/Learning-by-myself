class Solution {
    public int majorityElement(int[] nums) {
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
        if(maxOc < myMap.get(k)){
            maxOc = myMap.get(k);
            result = k;
        }
       }
        return result;
    }
}