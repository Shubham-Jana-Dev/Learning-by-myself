import java.util.Arrays;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int temp = nums[0];
        List<Integer> resultList = new ArrayList<>();
        for (int j = 1; j < nums.length; j++){
                int inLoopCount = nums[j] - temp;
                for(int k = 0; k<inLoopCount; k++){
                    if(temp+1 != nums[j]){
                        resultList.add(temp+1);
                    }
                temp++;
                }
            }
        return resultList;

    }
}