class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        for (int j = 0; j<nums.length; j++){
            if(j > maxJump){
                return false;
            }else{
                maxJump = Integer.max(maxJump, j + nums[j]);
            }
        }
        return true;
    }
}