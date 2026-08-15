class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 1; i < 1000; i++){
            if(i%k == 0 && !(Arrays.binarySearch(nums, i) >= 0)){
                return i;
            }
        }
        return -1;
    }
}