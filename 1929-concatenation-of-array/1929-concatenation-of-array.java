class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] resultArray = new int[nums.length * 2];
        for(int j = 0; j < nums.length; j++){
            resultArray[j] = nums[j];
            resultArray[nums.length + j] = nums[j];
        }
        return resultArray;
    }
}