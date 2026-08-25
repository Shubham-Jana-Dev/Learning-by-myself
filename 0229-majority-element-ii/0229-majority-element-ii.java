class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int mCount = nums.length / 3;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int j : nums){
            myMap.put(j,myMap.getOrDefault(j,0) + 1);
        }
        for(Integer k : myMap.keySet()){
            if(myMap.get(k)>mCount){
                result.add(k);
            }
        }
        return result;
    }
}