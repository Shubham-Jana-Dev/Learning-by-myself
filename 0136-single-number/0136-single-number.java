class Solution {
    public int singleNumber(int[] nums) {
        boolean flag = false;
        int theElement = 0;
        for(int j : nums){
            for(int k : nums){
                if(j == k){
                    flag = !flag;
                    theElement = k;
                }
            }
            if(flag == true){
                break;
            }
        }
        return theElement;
    }
}