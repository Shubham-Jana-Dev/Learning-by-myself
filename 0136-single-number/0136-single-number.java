class Solution {
    public int singleNumber(int[] nums) {
        //boolean flag = false;
        int theElement = 0;
        for(int j : nums){
           theElement = theElement ^ j;
        }
        return theElement;
    }
}