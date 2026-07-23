class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int result = 99;
        if(target > nums[nums.length - 1]){
            return (nums.length);
        }
        if(nums.length ==1){
            return 0;
        }
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]>target){
                end = mid-1;
                if(end > 0){
                    result = end;
                }else{
                    result = mid;
                }
            }else if(nums[mid]<target){
                start = mid+1;
                result = start ;
               if(mid == nums.length-2 || target < nums[mid+1]){
                return result;
               }
            }
            else {
                result = mid ;
                return result;
            }

        }
        // if((target<nums[nums.length - 1] && target>nums[nums.length-2])){
        //     return nums.length - 2;
        // }
        return result;
    }
}