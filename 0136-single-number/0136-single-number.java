class Solution {
    public int singleNumber(int[] nums) {
        int theElement = 0;
        for(int j : nums){
           theElement = theElement ^ j;
        }
        return theElement;
    }
}