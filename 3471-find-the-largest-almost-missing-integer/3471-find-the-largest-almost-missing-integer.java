class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int maxNum = -1;
        if (nums.length == k) {
            Arrays.sort(nums);
            boolean flag = true;
            if (nums[0] == nums[nums.length - 1] && k == nums.length) {
                return nums[0];
            }
            for (int l = nums.length - 1; l > 0; l--) {
                if (l >= 1 && nums[l] != nums[l - 1]) {
                    return nums[l];
                } else {
                    flag = false;
                }
            }
            if (flag == false) {
                return -1;
            }
        } else {

            int l = nums.length - 1;
            if (nums[0] == nums[l] && nums.length == 2) {
                return -1;
            }


            for (int m : nums) {
                myMap.put(m, myMap.getOrDefault(m, 0) + 1);
            }

            if (k == 1) {
                Arrays.sort(nums);
                for(int u = nums.length-1; u > 0; u--){
                    if(myMap.get(nums[u]) == 1){
                        return nums[u];
                    }
                }
            
            }


            if (myMap.get(nums[0]) == 1 && myMap.get(nums[l]) > 1) {
                return nums[0];
            } else if (myMap.get(nums[0]) > 1 && myMap.get(nums[l]) == 1) {
                return nums[l];
            } else if (myMap.get(nums[0]) == 1 && myMap.get(nums[l]) == 1){
                return Math.max(nums[0], nums[l]);
            }else{
                return -1;
            }
        }
        return -1;
    }
}