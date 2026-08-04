import java.util.Arrays;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int temp = nums[0];
        // Integer[] inArray = new Integer[nums.length];
        // for(int k =0; k< nums.length; k++){
        //     inArray[k] = nums[k];
        // }
        List<Integer> resultList = new ArrayList<>();
        // int loop_count = nums[nums.length-1] - nums[0];
        // for(int i = 0; i<loop_count; i++){
        //     temp++;
        //     if(!Arrays.asList(inArray).contains(temp)){
        //         resultList.add(temp);
        //     }else{
        //         continue;
        //     }
        // }
        // return resultList;

        //int j = 1;
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