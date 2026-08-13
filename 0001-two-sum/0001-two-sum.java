class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int j = 0; j < nums.length; j++){
            for(int k = j +1; k < nums.length; k++){
                if(nums[j] + nums[k] == target){
                    result[0] = j;
                    result[1] = k;
                    break;
                }
            }
        }
        return result;
    }
}