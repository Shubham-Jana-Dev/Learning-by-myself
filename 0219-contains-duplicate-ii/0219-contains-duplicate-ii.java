class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        ///
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(myMap.containsKey(nums[i]) && (i - myMap.get(nums[i]) <= k)){
                return true;
            }
            myMap.put(nums[i],i);
        }
        return false;
    }
}