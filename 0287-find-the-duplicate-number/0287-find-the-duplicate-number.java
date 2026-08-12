class Solution {
    public int findDuplicate(int[] nums) {
        int my_num = 0;
        int fast = 1;
        int slow = 0;
        int[] nums2 = nums;
        Arrays.sort(nums2);
       while(fast < nums2.length){
            if(nums2[fast] == nums2[slow]){
                my_num = nums2[fast];
                break;
            }
            fast++;
            slow++;
        }
        return my_num;
    }
}