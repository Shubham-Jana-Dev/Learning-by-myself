class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 1;
        boolean ascending = true;
        boolean decending = true;
        for(int j = 0; j < nums.length-1;j++){
            if(nums[j] < nums[i]){
                decending = false;
            }
            if(nums[j] > nums[i]){
                ascending = false;
            }
            i++;
        }
        if(ascending || decending){
            return true;
        }else{
            return false;
        }
    }
}